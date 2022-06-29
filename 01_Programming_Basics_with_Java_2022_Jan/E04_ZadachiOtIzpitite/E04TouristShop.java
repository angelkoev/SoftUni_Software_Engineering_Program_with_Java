import javax.swing.*;
import java.util.Scanner;

public class E04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        int count = 0;
        boolean noMoreMoney = false;
        double paidMoney = 0;
        double price = 0;

        while (!input.equals("Stop")) {
            price = Double.parseDouble(scanner.nextLine());

            count++;

            if (count % 3 == 0) {
                price = price / 2;
            }

            if (price <= budget) {
                paidMoney = paidMoney + price;
                budget = budget - price;
            } else {
                noMoreMoney = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (noMoreMoney) {
            System.out.printf("You don't have enough money!%n");
            System.out.printf("You need %.2f leva!", Math.abs(budget-price));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", count, paidMoney);
        }
    }
}
