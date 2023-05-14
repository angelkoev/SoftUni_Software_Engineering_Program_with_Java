package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
//            char currentChar = text.charAt(i);
//            currentChar++;
//            currentChar++;
//            currentChar++;

            char currentChar = (char) (text.charAt(i) + 3);
            encryptedText.append(currentChar);
        }

        System.out.println(encryptedText);
    }
}
