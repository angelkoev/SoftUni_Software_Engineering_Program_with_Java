package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean locked = false;
        int openingBracketsCount = 0;
        int closingBracketsCount = 0;

        for (int i = 0; i < n ; i++) {
            String character = scanner.nextLine();

            char currentChar = character.charAt(0);
            if (currentChar == '(') {
                openingBracketsCount++;
            } else if (currentChar == ')') {
                closingBracketsCount++;
            }

            if (!(openingBracketsCount == closingBracketsCount || openingBracketsCount == closingBracketsCount + 1)) {
                locked = true;
            }

        }
        if (locked) {
            System.out.println("UNBALANCED");

        } else {
            System.out.println("BALANCED");
        }

    }
}
