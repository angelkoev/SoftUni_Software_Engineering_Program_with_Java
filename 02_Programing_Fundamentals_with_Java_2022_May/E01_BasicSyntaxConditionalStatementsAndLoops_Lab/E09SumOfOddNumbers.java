package E01_BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class E09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int totalSum = 0;

        for (int i = 1; counter < numbers; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                totalSum += i;
                counter++;
            }
        }
        System.out.printf("Sum: %d", totalSum);
    }
}
