package E01_BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class E04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }
//        System.out.println();
//        System.out.printf("Sum: %d", sum);
         System.out.printf("%nSum: %d", sum);
    }
}
