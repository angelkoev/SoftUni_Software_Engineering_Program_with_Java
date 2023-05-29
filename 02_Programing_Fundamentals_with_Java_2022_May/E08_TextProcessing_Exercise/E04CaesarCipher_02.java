package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E04CaesarCipher_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder encryptedText = new StringBuilder();
        for (char symbol : input) {
            encryptedText.append(String.format("%c", symbol + 3));
        }
        System.out.println(encryptedText);
    }
}
