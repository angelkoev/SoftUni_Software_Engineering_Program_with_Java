package E05_MidExamRetake04;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2031#0
public class E01GuineaPig_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayKgGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigGrams = Double.parseDouble(scanner.nextLine()) * 1000;

        int dayCount = 0;
        while (dayCount != 30) {
            dayCount++;
            foodGrams -= 300;

            if (dayCount % 2 == 0) {
                hayKgGrams = hayKgGrams - foodGrams * 0.05;
            }

            if (dayCount % 3 == 0) {
                coverGrams = coverGrams - pigGrams / 3;
            }

            if (foodGrams <= 0 || hayKgGrams <= 0 || coverGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }


        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGrams/1000, hayKgGrams/1000, coverGrams/1000);

    }
}
