package E10_FinalExamRetake03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// тука може и с 2 List-а, в единия да пазим нормалната дума, в другия reverse-натата !!!
// даже така май ще е по-лесно за написване, защото така и так сме обърнали думата...

// даже май може да стане и с мап... key-a е едната дума, value-то е обърнатата дума

public class E02MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#]{1})(?<wordOne>[a-zA-Z]{3,})\\1{2}(?<wordTwo>[a-zA-Z]{3,})\\1";

        int pairsCounter = 0;

        List<String> firstWords = new ArrayList<>();
        List<String> reversedWords = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            pairsCounter++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            String reversedWordTwo = "";
            for (int i = wordTwo.length() - 1; i >= 0; i--) {
                reversedWordTwo += wordTwo.charAt(i);
            }
            if (wordOne.equals(reversedWordTwo)) {
                firstWords.add(wordOne);
                reversedWords.add(wordTwo);
            }
//            StringBuilder wordOne = new StringBuilder(matcher.group("wordOne"));
//            StringBuilder wordTwo = new StringBuilder(matcher.group("wordTwo"));
//            if (wordOne.compareTo(wordTwo.reverse()) == 0) {
//                pairWords.add(wordOne);
//            }
        }
        if (pairsCounter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", pairsCounter);
        }
        if (firstWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < firstWords.size(); i++) {
                System.out.printf("%s <=> %s", firstWords.get(i), reversedWords.get(i));
                if (i < firstWords.size() - 1) {
                    System.out.print(", ");
                }
            }
        }

    }
}
