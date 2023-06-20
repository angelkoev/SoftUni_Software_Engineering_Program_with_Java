package E08_TextProcessing_Lab;

import java.util.Scanner;

public class E03Substring_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeWord = scanner.nextLine();
        String text = scanner.nextLine();

        int removeIndex = text.indexOf(removeWord);

        while (removeIndex != -1) {

            String firstPart = text.substring(0, removeIndex);
            String secondPart = text.substring(removeIndex + removeWord.length());

            text = firstPart + secondPart;

            removeIndex = text.indexOf(removeWord);
        }

        System.out.println(text);

    }
}
