package E01_BasicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class E04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedInput = "";

        for (int i = 1; i <= input.length(); i++) {
            reversedInput = reversedInput + input.charAt(input.length()-i);
        }

        System.out.println(reversedInput);
    }
}
