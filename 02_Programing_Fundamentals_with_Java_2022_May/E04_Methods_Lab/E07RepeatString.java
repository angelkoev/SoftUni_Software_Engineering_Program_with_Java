package E04_Methods_Lab;

import java.util.Scanner;

public class E07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strToRepeat = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(strToRepeat, count));
    }

    public static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}


