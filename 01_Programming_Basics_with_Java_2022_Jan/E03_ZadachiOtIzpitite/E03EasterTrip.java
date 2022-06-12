import java.util.Scanner;

public class E03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double destinationPrice = 0;

        if (dates.equals("21-23")) {
            switch (destination) {
                case "France":
                    destinationPrice = 30;
                    break;
                case "Italy":
                    destinationPrice = 28;
                    break;
                case "Germany":
                    destinationPrice = 32;
                    break;
            }
        } else if (dates.equals("24-27")) {
            switch (destination) {
                case "France":
                    destinationPrice = 35;
                    break;
                case "Italy":
                    destinationPrice = 32;
                    break;
                case "Germany":
                    destinationPrice = 37;
                    break;
            }
        } else if (dates.equals("28-31")) {
            switch (destination) {
                case "France":
                    destinationPrice = 40;
                    break;
                case "Italy":
                    destinationPrice = 39;
                    break;
                case "Germany":
                    destinationPrice = 43;
                    break;
            }
        }
        double totalPrice = destinationPrice * days;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);

    }
}
