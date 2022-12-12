package E05_MidExamRetake01;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2517#0
public class E01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("special") && !input.equals("regular")) {

            double currentPrice = Double.parseDouble(input);

            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                sum += currentPrice;
            }

            input = scanner.nextLine();
        }

        if (sum == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", sum * 0.2);
            System.out.println("-----------");
            if (input.equals("regular")) {
                System.out.printf("Total price: %.2f$%n", sum * 1.2);
            } else if (input.equals("special")) {
                System.out.printf("Total price: %.2f$%n", sum * 1.2 * 0.9);
            }
        }

    }
}
