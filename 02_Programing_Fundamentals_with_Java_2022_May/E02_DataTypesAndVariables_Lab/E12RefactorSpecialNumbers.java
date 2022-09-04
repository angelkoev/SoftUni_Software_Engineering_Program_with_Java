package E02_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class E12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;
        boolean isSpecialNumber = false;
        for (int ch = 1; ch <= count; ch++) {
            number = ch;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }
            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNumber) {

                System.out.printf("%d -> True%n", number);
                sum = 0;
                ch = number;
            } else {
                System.out.printf("%d -> False%n", number);
                sum = 0;
                ch = number;
            }
        }


    }
}
