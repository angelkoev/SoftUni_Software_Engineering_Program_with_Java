import java.util.Scanner;

public class E01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if (category.equals("VIP")) {
            ticketPrice = 499.99;
        } else if (category.equals("Normal")) {
            ticketPrice = 249.99;
        }

        if (people >= 1 && people <= 4) {
            budget = budget * 0.25;
        } else if (people >= 5 && people <= 9) {
            budget = budget * 0.4;
        } else if (people >= 10 && people <= 24) {
            budget = budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            budget = budget * 0.6;
        } else if (people >= 50) {
            budget = budget * 0.75;
        }


        double diff = Math.abs(budget - ticketPrice * people);

        if (budget >= ticketPrice * people) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }


    }
}
