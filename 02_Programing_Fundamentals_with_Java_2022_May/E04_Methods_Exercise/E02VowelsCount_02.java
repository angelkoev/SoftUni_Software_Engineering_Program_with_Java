package E04_Methods_Exercise;

import java.util.Locale;
import java.util.Scanner;

public class E02VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
//        String text = scanner.nextLine().toLowerCase();   // и така става, вместо после да го намаляме,
                                                            // но в метода може да е по-добре
        printCountVowels(text);
    }

    private static void printCountVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.toLowerCase().charAt(i);
            switch (currentSymbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
//                case 'y':  // y май не се брой за главна буква !!!
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
