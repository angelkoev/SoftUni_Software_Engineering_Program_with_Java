package E05_MidExamRetake01;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2517#0
public class E01ComputerStore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double allSum = 0;

        while (!input.equals("regular") && !input.equals("special")) {
            double currentPrice = Double.parseDouble(input);

            if (currentPrice <= 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }

            allSum += currentPrice;

            input = scanner.nextLine();
        }

        double taxes = allSum * 0.2;
        double priceWithVAT = allSum * 1.2;

        if (input.equals("special")) {
            priceWithVAT = priceWithVAT * 0.9;
        }

        if (priceWithVAT <= 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", allSum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", priceWithVAT);
        }


    }
}
