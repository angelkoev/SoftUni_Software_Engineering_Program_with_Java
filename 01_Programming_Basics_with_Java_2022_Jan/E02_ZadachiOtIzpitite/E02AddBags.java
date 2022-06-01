import java.util.Scanner;

public class E02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFor20kg = Double.parseDouble(scanner.nextLine());
        double kgBaggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int baggageCount = Integer.parseInt(scanner.nextLine());

        if (kgBaggage < 10) {
            priceFor20kg = priceFor20kg * 0.2;
        } else if (kgBaggage <= 20) {
                priceFor20kg = priceFor20kg * 0.5;
                    } else if (kgBaggage > 20) {
            priceFor20kg = priceFor20kg;
        }

        if (days > 30) {
            priceFor20kg = priceFor20kg * 1.1;
        } else if (days >= 7) {
            priceFor20kg = priceFor20kg * 1.15;
        } else if (days < 7 ) {
            priceFor20kg = priceFor20kg * 1.4;
        }

        double total = baggageCount * priceFor20kg;

        System.out.printf("The total price of bags is: %.2f lv.", total);

    }
}
