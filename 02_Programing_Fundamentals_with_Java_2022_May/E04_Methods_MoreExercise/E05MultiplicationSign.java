package E04_Methods_MoreExercise;

import java.util.Scanner;

public class E05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int negativeOrPositiveCount = negativeOrPositiveCount(num1, num2, num3);

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if (negativeOrPositiveCount % 2 != 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }
    private static int negativeOrPositiveCount(int num1, int num2, int num3) {
        int negativeSignCount = 0;
        if (num1 < 0) {
            negativeSignCount++;
        }
        if (num2 < 0) {
            negativeSignCount++;
        }
        if (num3 < 0) {
            negativeSignCount++;
        }
        return negativeSignCount;
    }
}
