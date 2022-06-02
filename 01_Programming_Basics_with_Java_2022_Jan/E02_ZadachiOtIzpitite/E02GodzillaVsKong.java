import java.util.Scanner;

public class E02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double suitPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;

        double priceStatists = numberStatists * suitPrice;

        if (numberStatists > 150) {
            priceStatists = priceStatists * 0.9;
        }

        double totalPrice = priceStatists + decorPrice;

        double diff = Math.abs(totalPrice - budget);

       if (budget >= totalPrice) {
           System.out.printf("Action!%n");
           System.out.printf("Wingard starts filming with %.2f leva left.", diff);
       } else {
           System.out.printf("Not enough money!%n");
           System.out.printf("Wingard needs %.02f leva more.", diff);
       }


    }
}
