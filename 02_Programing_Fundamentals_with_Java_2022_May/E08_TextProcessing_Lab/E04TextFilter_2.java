package E08_TextProcessing_Lab;

import java.util.Scanner;

public class E04TextFilter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWords) {
                String replacement = repeatStr(("*"), banWord.length());
                text = text.replace(banWord, replacement);
                    }

        System.out.println(text);
    }
    private static String repeatStr (String str, int lenght) {
        String replacement = "";
        for (int i = 0; i < lenght; i++) {
            replacement += str;
        }
        return replacement;
    }
}
