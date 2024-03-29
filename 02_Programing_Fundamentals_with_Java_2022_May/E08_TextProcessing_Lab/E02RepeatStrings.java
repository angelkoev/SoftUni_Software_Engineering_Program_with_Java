package E08_TextProcessing_Lab;

import java.util.Scanner;

public class E02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        for (String word : words) {
            System.out.print(repeat(word, word.length()));
        }
    }

    private static String repeat(String word, int repetitions) {
        char[] repeated = new char[word.length() * repetitions];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String(repeated);
    }
}