package E08_TextProcessing_Exercise;

import java.util.Scanner;

public class E08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(getAlphabetPisition('d'));

        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0.0;

        for (String s : input) {
            char letterBefore = s.charAt(0);
            char letterAfter = s.charAt(s.length() - 1);
            String digits = s.substring(1, s.length() - 1);
            double number = Double.parseDouble(digits);
            int letterBeforePosition = getAlphabetPisition(letterBefore);
            int letterAfterPosition = getAlphabetPisition(letterAfter);

            if (Character.isUpperCase(letterBefore)) {
                sum += number / letterBeforePosition;
            } else {
                sum += number * letterBeforePosition;
            }

            if (Character.isUpperCase(letterAfter)) {
                sum -= letterAfterPosition;
            } else {
                sum += letterAfterPosition;
            }
        }

        System.out.printf("%.2f", sum);

    }

    static int getAlphabetPisition(char c) {
        return Character.toLowerCase(c) - 96;  //всичките ги приравняваме,
    }  // за да не правим още една проверка и да вадим 64 за главна буква !!!
}
