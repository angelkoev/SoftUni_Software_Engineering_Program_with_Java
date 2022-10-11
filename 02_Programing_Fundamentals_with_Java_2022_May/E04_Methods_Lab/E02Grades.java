package E04_Methods_Lab;

import java.util.Scanner;

public class E02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        printGrade(number);
    }

    private static void printGrade(double number) {
        if (2 <= number && number <= 2.99) {
            System.out.println("Fail");
        } else if (3 <= number && number <= 3.49) {
            System.out.println("Poor");
        } else if (3.5 <= number && number <= 4.49) {
            System.out.println("Good");
        } else if (4.5 <= number && number <= 5.49) {
            System.out.println("Very good");
        } else if (5.5 <= number && number <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
