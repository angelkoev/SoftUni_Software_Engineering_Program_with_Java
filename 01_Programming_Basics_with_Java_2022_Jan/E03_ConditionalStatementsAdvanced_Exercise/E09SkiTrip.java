import java.util.Scanner;

public class E09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String score = scanner.nextLine();

        double roomPrice = 0;
        int nights = days - 1;

        double priceRoomForOnePerson = 18;
        double priceApartment = 25;
        double pricePresidentApartment = 35;

        if (roomType.equals("apartment")) {
            if (days < 10) {
                roomPrice = priceApartment * 0.7;
            } else if (days <= 15) {
                roomPrice = priceApartment * 0.65;
            } else if (days > 15) {
                roomPrice = priceApartment * 0.5;
            }
        } else if (roomType.equals("president apartment")) {
            if (days < 10) {
                roomPrice = pricePresidentApartment * 0.9;
            } else if (days <= 15) {
                roomPrice = pricePresidentApartment * 0.85;
            } else if (days > 15) {
                roomPrice = pricePresidentApartment * 0.8;
            }
        } else if (roomType.equals("room for one person")) {
              roomPrice = priceRoomForOnePerson;
        }

        if (score.equals("positive")) {
            roomPrice = roomPrice * 1.25;
        } else if (score.equals("negative")) {
            roomPrice = roomPrice * 0.9;
        }

        double finalPrice = roomPrice * nights;
        System.out.printf("%.2f", finalPrice);

    }
}

