package E04_Methods_Exercise;

import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printCharInRange(start, end);

    }

    private static void printCharInRange(char start, char end) {
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }
        for (int i = start + 1; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }
}