package E08_TextProcessing_MoreExercise;

import java.util.Scanner;

public class E02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (isBetweenSymbols(start, end, text.charAt(i))) {
                sum += text.charAt(i);
            }
        }

        System.out.println(sum);

    }
    private static boolean isBetweenSymbols(char start, char end, char currentChar) {
        return (start < currentChar && currentChar < end);
    }
}
