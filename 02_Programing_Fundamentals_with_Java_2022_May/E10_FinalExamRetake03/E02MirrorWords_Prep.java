package E10_FinalExamRetake03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02MirrorWords_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([@#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        int counter = 0;

        List<String> mirrorWords = new ArrayList<>();

        while (matcher.find()) {

            counter++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");

            StringBuilder wordTwoToReverse = new StringBuilder(wordTwo);
            wordTwoToReverse.reverse();

            if (wordOne.equals(wordTwoToReverse.toString())) {
                mirrorWords.add(wordOne + " <=> " + wordTwo);
            }

        }

        if (counter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(counter + " word pairs found!");
        }

        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }
    }

}
