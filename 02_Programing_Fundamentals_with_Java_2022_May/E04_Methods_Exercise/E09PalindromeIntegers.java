package E04_Methods_Exercise;

import java.util.Scanner;

public class E09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(isPalidrome(input));

            input = scanner.nextLine();
        }

    }

    private static boolean isPalidrome(String number) {
        String reversedNumber = getReversedNumber(number);
        return number.equals(reversedNumber);

    }

    private static String getReversedNumber(String number) {
        String reversed = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            char currentElement = number.charAt(i);
            reversed += currentElement;
        }
        return reversed;
    }
}
