package E05_MidExamPreparation20June2022;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2517#0
public class E01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0.0;

        while (!input.equals("special") && !input.equals("regular")) {
            double currentPrice = Double.parseDouble(input);
            if (currentPrice <= 0) {
                System.out.println("Invalid price!");
            } else {
                totalSum += currentPrice;
            }

            input = scanner.nextLine();
        }

        double sumAddedVAT = totalSum * 1.2;
        if (sumAddedVAT == 0) {
            System.out.println("Invalid order!");
            return;
        } else if (input.equals("special")) {
            sumAddedVAT *= 0.9;
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalSum);
        System.out.printf("Taxes: %.2f$%n", totalSum * 0.2);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n", sumAddedVAT);
    }
}
