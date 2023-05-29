package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();

        int remainder = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = digit * multiplier + remainder;
            if (i == 0) {
                result.insert(0, product);
            } else {
                int digitToAdd = product % 10;
                remainder = product / 10;
                result.insert(0, digitToAdd);
            }
        }

        //Removing leading zeros
        while (result.charAt(0) == '0' && result.length() > 1) {
            result.deleteCharAt(0);
        }

        System.out.println(result);
    }
}
