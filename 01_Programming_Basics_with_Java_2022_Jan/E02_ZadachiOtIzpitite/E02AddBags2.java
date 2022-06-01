import java.util.Scanner;

public class E02AddBags2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double baggageKg = Double.parseDouble(scanner.nextLine());
        int leftDays = Integer.parseInt(scanner.nextLine());
        int countBaggages = Integer.parseInt(scanner.nextLine());
        double priceBaggage = 0;

        if (baggageKg < 10) {
            priceBaggage = priceOver20kg * 0.2;
        } else if (baggageKg <= 20) {
            priceBaggage = priceOver20kg * 0.5;
        } else if (baggageKg > 20) {
            priceBaggage = priceOver20kg;
        }


        if (leftDays < 7) {
            priceBaggage = priceBaggage * 1.4;
        } else if (leftDays <= 30 ) {
            priceBaggage = priceBaggage * 1.15;
        } else if (leftDays > 30) {
            priceBaggage = priceBaggage * 1.1;
        }

        double totalPrice = priceBaggage * countBaggages;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice );

    }
}
