package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E04Refactoring_PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= end; i++) {
            boolean isPrime = true;
            for (int divider = 2; divider < i; divider++) {
                if (i % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }
}
