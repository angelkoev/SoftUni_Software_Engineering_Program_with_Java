import java.sql.SQLOutput;
import java.util.Scanner;

public class E03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        boolean letterN = false;
        int countletterN = 0;
        boolean letterO = false;
        int countletterO = 0;
        boolean letterC = false;
        int countletterC = 0;
        boolean secredCommand = false;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            char letter = input.charAt(0);
            if (letter == 'n' && countletterN < 1) {
                countletterN++;
                letterN = true;
            } else if (letter == 'o' && countletterO < 1) {
                countletterO++;
                letterO = true;
            } else if (letter == 'c' && countletterC < 1) {
                countletterC++;
                letterC = true;
            } else if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
                result = result + letter;
            }

            if (letterN && letterO && letterC) {
                secredCommand = true;
                countletterN = 0;
                countletterO = 0;
                countletterC = 0;
                letterN = false;
                letterO = false;
                letterC = false;

            }
            if (secredCommand) {
                System.out.printf("%s ", result);
                result = "";
                secredCommand = false;
            }

            input = scanner.nextLine();
        }

    }
}
