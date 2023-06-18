package E08_TextProcessing_Lab;

import java.util.Scanner;

public class E01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.printf("%s = %s%n", word, reversed);

            word = scanner.nextLine();
        }

    }
}
