import java.util.Scanner;

public class E03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String type = scanner.nextLine();
        int quantityTickets = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();

        double priceTicket = 0;

        if (stage.equals("Quarter final")) {
            switch (type) {
                case "Standard":
                    priceTicket = 55.5;
                    break;
                case "Premium":
                    priceTicket = 105.2;
                    break;
                case "VIP":
                    priceTicket = 118.9;
                    break;
            }
        } else if (stage.equals("Semi final")) {
            switch (type) {
                case "Standard":
                    priceTicket = 75.88;
                    break;
                case "Premium":
                    priceTicket = 125.22;
                    break;
                case "VIP":
                    priceTicket = 300.40;
                    break;
            }
        } else if (stage.equals("Final")) {
            switch (type) {
                case "Standard":
                    priceTicket = 110.1;
                    break;
                case "Premium":
                    priceTicket = 160.66;
                    break;
                case "VIP":
                    priceTicket = 400;
                    break;
            }
        }

        double totalPrice = priceTicket * quantityTickets;

        if (totalPrice > 4000) {
            totalPrice = totalPrice * 0.75;
        } else if (totalPrice > 2500) {
            totalPrice = totalPrice * 0.9;
        }

        if (picture.equals("Y") && priceTicket * quantityTickets <= 4000) {
            totalPrice = totalPrice + quantityTickets * 40;
        }

        System.out.printf("%.2f", totalPrice);

    }
}
