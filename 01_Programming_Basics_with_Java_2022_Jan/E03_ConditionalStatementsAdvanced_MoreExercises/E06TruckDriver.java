import java.util.Scanner;

public class E06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double pricePerKm = 0;

        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerKm = 0.75;
                    break;
                case "Summer":
                    pricePerKm = 0.9;
                    break;
                case "Winter":
                    pricePerKm = 1.05;
                    break;
            }
        } else if (kmPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerKm = 0.95;
                    break;
                case "Summer":
                    pricePerKm = 1.1;
                    break;
                case "Winter":
                    pricePerKm = 1.25;
                    break;
            }
        } else if (kmPerMonth <= 20000) {
            pricePerKm = 1.45;
        }
        double totalPrice = kmPerMonth * pricePerKm * 4 * 0.9;
        System.out.printf("%.2f", totalPrice);
    }
}