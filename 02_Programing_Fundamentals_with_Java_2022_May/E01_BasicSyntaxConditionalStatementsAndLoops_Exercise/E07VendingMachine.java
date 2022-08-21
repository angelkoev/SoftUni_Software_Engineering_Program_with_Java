package E01_BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double insertedMoney = 0;

        while (!"Start".equals(input)) {
            double money = Double.parseDouble(input);

            if (money == 0.1) {
                insertedMoney += 0.1;
            } else if (money == 0.2) {
                insertedMoney += 0.2;
            } else if (money == 0.5) {
                insertedMoney += 0.5;
            } else if (money == 1) {
                insertedMoney += 1;
            } else if (insertedMoney == 2) {
                insertedMoney += 2;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }

            input = scanner.nextLine();
        }

        String itemType = scanner.nextLine();

        while (!"End".equals(itemType)) {

            switch (itemType) {
                case "Nuts":
                    if (insertedMoney >= 2) {
                        System.out.printf("Purchased %s%n", itemType);
                        insertedMoney -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (insertedMoney >= 0.7) {
                        System.out.printf("Purchased %s%n", itemType);
                        insertedMoney -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (insertedMoney >= 1.5) {
                        System.out.printf("Purchased %s%n", itemType);
                        insertedMoney -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (insertedMoney >= 0.8) {
                        System.out.printf("Purchased %s%n", itemType);
                        insertedMoney -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (insertedMoney >= 1) {
                        System.out.printf("Purchased %s%n", itemType);
                        insertedMoney -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            itemType = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", insertedMoney);

    }
}
