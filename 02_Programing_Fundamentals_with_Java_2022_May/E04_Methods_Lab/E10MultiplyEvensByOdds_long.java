package E04_Methods_Lab;

import java.util.Scanner;

public class E10MultiplyEvensByOdds_long {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = Long.parseLong(scanner.nextLine());
        input = Math.abs(input);

        System.out.println(getMultipleOfEvensAndOdds(input));
    }

    public static int getMultipleOfEvensAndOdds(long input) {
        int countDigits = 0;
        long number = input;

        while (number != 0) {
            countDigits++;
            number = number / 10;
        }
        int evenSum = 0;
        int oddSum = 0;
        if (countDigits % 2 == 0) {

            while (input > 0) {
                evenSum += input % 10;
                input = input / 10;
                oddSum += input % 10;
                input = input / 10;
            }
        } else {
            while (input > 0) {
                oddSum += input % 10;
                input = input / 10;
                evenSum += input % 10;
                input = input / 10;
            }
        }
        return evenSum * oddSum;
    }

}