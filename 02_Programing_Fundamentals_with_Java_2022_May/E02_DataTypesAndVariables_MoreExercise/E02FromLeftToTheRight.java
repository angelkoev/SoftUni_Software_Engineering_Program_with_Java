package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            long input1 = scanner.nextLong();
            long input2 = scanner.nextLong();
            sum = 0;
            if (input1 >= input2) {
                while (input1 != 0) {
                    long digit = input1 % 10;
                    sum += digit;
                    input1 /= 10;
                }
                System.out.println(Math.abs(sum));
            } else {
                while (input2 != 0) {
                    long digit = input2 % 10;
                    sum += digit;
                    input2 /= 10;
                }
                System.out.println(Math.abs(sum));
            }

        }

    }
}
