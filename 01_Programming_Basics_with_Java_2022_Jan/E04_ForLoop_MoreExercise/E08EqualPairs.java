import javax.swing.*;
import java.util.Scanner;

public class E08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sumNums1 = 0;
        int sumNums2 = 0;
        boolean isEqual = false;

        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sumNums1 = num1 + num2;
            if (sumNums1 == sumNums2) {
                isEqual = true;
            } else if (sumNums1 >= max) {
                max = sumNums1;
                isEqual = false;
            } else if (sumNums1 <= min) {
                min = sumNums1;
                isEqual = false;
            }
            if (sumNums1 >= sumNums2) {
                min = sumNums2;
            }

            sumNums2 = sumNums1;

        }

        int diff = Math.abs(max - min);

        if (isEqual || n == 1) {
            System.out.printf("Yes, value=%d", sumNums1);
        } else {
            System.out.printf("No, maxdiff=%d", diff);
        }

//        System.out.println(sumNums1);
//        System.out.println(sumNums2);
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(diff);
    }
}
