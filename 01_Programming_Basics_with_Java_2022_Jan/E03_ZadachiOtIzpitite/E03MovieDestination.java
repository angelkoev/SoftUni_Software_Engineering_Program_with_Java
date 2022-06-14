import java.util.Scanner;

public class E03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    price = 45000;
                    break;
                case "Sofia":
                    price = 17000;
                    break;
                case "London":
                    price = 24000;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    price = 40000;
                    break;
                case "Sofia":
                    price = 12500;
                    break;
                case "London":
                    price = 20250;
                    break;
            }
        }

        if (destination.equals("Dubai")) {
            price = price * 0.7;
        }
        if (destination.equals("Sofia")) {
            price = price * 1.25;
        }

        double diff = Math.abs(budget - price * days);

        if (budget >= price * days) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }

    }
}
