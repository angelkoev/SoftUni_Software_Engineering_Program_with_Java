package E01_BasicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class E03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double totalSpend = 0;

        String input = scanner.nextLine();

        while (!"Game Time".equals(input)) {

            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if (budget >= 39.99) {
                        System.out.printf("Bought %s%n", input);
                        budget -= 39.99;
                        totalSpend += 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (budget >= 15.99) {
                        System.out.printf("Bought %s%n", input);
                        budget -= 15.99;
                        totalSpend += 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        System.out.printf("Bought %s%n", input);
                        budget -= 19.99;
                        totalSpend += 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (budget >= 59.99) {
                        System.out.printf("Bought %s%n", input);
                        budget -= 59.99;
                        totalSpend += 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (budget >= 29.99) {
                        System.out.printf("Bought %s%n", input);
                        budget -= 29.99;
                        totalSpend += 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.printf("Not Found%n");
                    break;
            }
            if (budget == 0) {
                System.out.println("Out of money!");
                return;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, budget);

    }
}
