package E08_TextProcessing_MoreExercise;

import java.util.Scanner;

public class E01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();

            int nameStart = text.indexOf('@');
            int nameEnd = text.indexOf('|');
            int ageStart = text.indexOf('#');
            int ageEnd = text.indexOf('*');

            String name = text.substring(nameStart + 1, nameEnd);
            String age = text.substring(ageStart + 1, ageEnd);

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
