package E01_BasicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class E05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String word = "";

        for (int i = 0; i < n ; i++) {
            String digits = scanner.nextLine();
            int digitLength = digits.length();
            int digit = digits.charAt(0) - '0'; // ASCII hack hehehe

            // горното ни връща поредността в ASCII таблицата
            // и вадим то нея поредността на символ "0"
            // и става точно тази цифра, която ни трябва

//            int digit = Integer.parseInt(digits) % 10; // това е като горния 15 ред !!!

            int offset = (digit - 2) * 3;

            if (digit == 0) {
                word += " ";
                continue;
            }

            if (digit == 8 || digit == 9) {
                offset++;
            }
            int letterIndex = offset + digitLength - 1;
            word += (char) (letterIndex + 97);

        }
        System.out.println(word);
    }
}
