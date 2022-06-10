import java.util.Scanner;

public class E07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        String sportType = "";

        if (groupType.equals("mixed")) {
            switch (season) {
                case "Winter":
                    pricePerNight = 10;
                    break;
                case "Spring":
                    pricePerNight = 9.5;
                    break;
                case "Summer":
                    pricePerNight = 20;
                    break;
            }

        } else {
            switch (season) {
                case "Winter":
                    pricePerNight = 9.6;
                    break;
                case "Spring":
                    pricePerNight = 7.2;
                    break;
                case "Summer":
                    pricePerNight = 15;
                    break;
            }
        }
        double totalPrice = numberStudents * pricePerNight * nights;

        if (numberStudents >= 50) {
            totalPrice = totalPrice * 0.5;
        }
        if (numberStudents >= 20 && numberStudents < 50) {
            totalPrice = totalPrice * 0.85;
        }
        if (numberStudents >= 10 && numberStudents < 20) {
            totalPrice = totalPrice * 0.95;
        }

        if (groupType.equals("girls")) {
            if (season.equals("Winter")) {
                sportType = "Gymnastics";
            } else if (season.equals("Spring")) {
                sportType = "Athletics";
            } else {
                sportType = "Volleyball";
            }
        } else if (groupType.equals("boys")) {
            if (season.equals("Winter")) {
                sportType = "Judo";
            } else if (season.equals("Spring")) {
                sportType = "Tennis";
            } else {
                sportType = "Football";
            }
        } else if (season.equals("Winter")) {
                sportType = "Ski";
            } else if (season.equals("Spring")) {
                sportType = "Cycling";
            } else {
                sportType = "Swimming";
            }

        System.out.printf("%s %.2f lv.", sportType, totalPrice);


    }
}
