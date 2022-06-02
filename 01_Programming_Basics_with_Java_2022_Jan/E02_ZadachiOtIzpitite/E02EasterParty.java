import java.util.Scanner;

public class E02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestCount = Integer.parseInt(scanner.nextLine());
        int pricePerGuest = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceToPay = guestCount * pricePerGuest;

        if (guestCount > 20) {
            priceToPay = priceToPay * 0.75;
        } else if (guestCount > 15) {
            priceToPay = priceToPay * 0.8;
        } else if (guestCount >= 10) {
            priceToPay = priceToPay * 0.85;
        }

        double cakePrice = budget * 0.1;
        double lastPriceToPay = priceToPay + cakePrice;
        double diff = Math.abs (budget - lastPriceToPay);

        if (budget >= lastPriceToPay) {
            System.out.printf("It is party time! %.2f leva left.", diff);
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }

    }
}
