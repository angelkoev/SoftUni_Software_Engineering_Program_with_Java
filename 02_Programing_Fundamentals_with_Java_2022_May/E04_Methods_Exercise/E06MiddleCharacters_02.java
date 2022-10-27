package E04_Methods_Exercise;

import java.util.Scanner;

public class E06MiddleCharacters_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);

    }

    private static void printMiddleChar(String text) {
        if (text.length() % 2 == 0) {
            int indexMiddleChar = text.length() / 2;
            System.out.print(text.charAt(indexMiddleChar - 1));
            System.out.print(text.charAt(indexMiddleChar));
        } else {
            int indexMiddleChar = text.length() / 2;
            System.out.print(text.charAt(indexMiddleChar));
        }
    }
}
