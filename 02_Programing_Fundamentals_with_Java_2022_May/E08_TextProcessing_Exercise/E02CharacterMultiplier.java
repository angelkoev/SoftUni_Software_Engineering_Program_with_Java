package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");

        int sum = charMultiply(text[0], text[1]);

        System.out.println(sum);

    }

    public static Integer charMultiply(String text1, String text2) {
        int loopLenght = Math.min(text1.length(), text2.length());
        int sum = 0;
        for (int i = 0; i < loopLenght; i++) {
            int currentSum = text1.charAt(i) * text2.charAt(i);
            sum += currentSum;
        }
        if (text1.length() > text2.length()) {
            for (int i = loopLenght; i < text1.length(); i++) {
                sum += text1.charAt(i);
            }
        } else if (text1.length() < text2.length()) {
            for (int i = loopLenght; i < text2.length(); i++) {
                sum += text2.charAt(i);
            }
        }
        return sum;
    }

}


