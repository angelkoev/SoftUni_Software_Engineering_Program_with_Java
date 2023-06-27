package E08_TextProcessing_Lab;

import java.util.Scanner;

public class E05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                digits.append(currentChar);
                } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            } else {
                specialChars.append(currentChar);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);

    }
}
