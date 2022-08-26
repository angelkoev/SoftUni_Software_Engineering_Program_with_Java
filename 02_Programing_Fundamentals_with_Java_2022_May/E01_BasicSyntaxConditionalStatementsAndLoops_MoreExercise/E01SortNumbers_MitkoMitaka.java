package E01_BasicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class E01SortNumbers_MitkoMitaka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int max = Math.max(Math.max(num1, num2), num3);
        int mid = 0;
        if (max == num1) {
            mid = Math.max(num2, num3);
        } else if (max == num2) {
            mid = Math.max(num1, num3);
        } else if (max == num3) {
            mid = Math.max(num1, num2);
        }
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.printf("%d%n%d%n%d", max, mid, min);
    }
}