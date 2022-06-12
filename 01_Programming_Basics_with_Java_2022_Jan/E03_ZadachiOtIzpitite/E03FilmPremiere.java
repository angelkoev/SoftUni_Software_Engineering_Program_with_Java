import java.util.Scanner;

public class E03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String food = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double priceTickets = 0;

        if (movie.equals("John Wick")) {
            switch (food) {
                case "Drink":
                    priceTickets = 12;
                    break;
                case "Popcorn":
                    priceTickets = 15;
                    break;
                case "Menu":
                    priceTickets = 19;
                    break;
            }
        } else if (movie.equals("Star Wars")) {
            switch (food) {
                case "Drink":
                    priceTickets = 18;
                    break;
                case "Popcorn":
                    priceTickets = 25;
                    break;
                case "Menu":
                    priceTickets = 30;
                    break;
            }
        } else if (movie.equals("Jumanji")) {
            switch (food) {
                case "Drink":
                    priceTickets = 9;
                    break;
                case "Popcorn":
                    priceTickets = 11;
                    break;
                case "Menu":
                    priceTickets = 14;
                    break;
            }
        }

        double totalPrice = priceTickets * tickets;

        if (movie.equals("Star Wars") && tickets >= 4) {
            totalPrice = totalPrice * 0.7;
        }

        if (movie.equals("Jumanji") && tickets == 2) {
            totalPrice = totalPrice * 0.85;
        }

        System.out.printf("Your bill is %.2f leva.", totalPrice);

    }
}
