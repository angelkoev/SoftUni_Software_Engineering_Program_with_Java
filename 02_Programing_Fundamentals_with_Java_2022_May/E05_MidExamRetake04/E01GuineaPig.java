package E05_MidExamRetake04;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2031#0
public class E01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodInGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double haysInGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverInGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigWeightInGrams = Double.parseDouble(scanner.nextLine()) * 1000;

        boolean noMoreSupplies = false;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;

            if (i % 2 == 0) {
                haysInGrams -= 0.05 * foodInGrams;
            }

            if (i % 3 == 0) {
                coverInGrams -= pigWeightInGrams / 3;
            }

            if (foodInGrams <= 0 || haysInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                noMoreSupplies = true;
                break;
            }

        }
        if (!noMoreSupplies) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGrams / 1000, haysInGrams / 1000, coverInGrams / 1000);
        }
    }
}
