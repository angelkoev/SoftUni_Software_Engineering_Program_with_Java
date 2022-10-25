package E04_Methods_Exercise;

import java.util.Scanner;

public class E03CharactersInRange_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c1 = scanner.nextLine().charAt(0);
        char c2 = scanner.nextLine().charAt(0);

        printSequenceBetweenChars(c1, c2);
    }

    private static void printSequenceBetweenChars(char c1, char c2) {
        if (c1 < c2) {
            for (char i = (char) (c1 + 1); i < c2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (c2 + 1); i < c1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
