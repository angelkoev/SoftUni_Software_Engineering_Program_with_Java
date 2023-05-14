package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E02CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        char[] text1 = data[0].toCharArray();
        char[] text2 = data[1].toCharArray();

        int smallerTextLenght = Math.min(text1.length, text2.length);
        int biggerTextLenght = Math.max(text1.length, text2.length);

        int sum = 0;

        for (int i = 0; i < biggerTextLenght; i++) {
            if (i < smallerTextLenght) {
                sum += text1[i] * text2[i];
            } else if (text1.length > text2.length) {
                sum += text1[i];
            } else {
                sum += text2[i];
            }
        }
        System.out.println(sum);
    }
}
