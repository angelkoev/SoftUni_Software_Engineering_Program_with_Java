package E04_Methods_Exercise;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (sumDevisible(i) && oneOddDigit(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean sumDevisible(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum % 8 == 0;
    }

    private static boolean oneOddDigit(int i) {
        while (i > 0)
            if (i % 2 != 0) {
                return true;
            } else {
                i = i / 10;
            }
        return false;
    }
}