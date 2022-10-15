package E04_Methods_Lab;

import java.util.Scanner;

public class E07RepeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());

        String repeated = repeatString(s, times);

        System.out.println(repeated);
    }

    private static String repeatString(String s, int times) {
        String[] strings = new String[times];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }
        String repeated = String.join("", strings);

        return repeated;
    }
}

