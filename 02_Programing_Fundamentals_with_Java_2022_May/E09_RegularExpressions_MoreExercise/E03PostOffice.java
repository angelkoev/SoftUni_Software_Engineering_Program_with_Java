package E09_RegularExpressions_MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];

        Pattern capital = Pattern.compile("([#$%*&])(?<capital>[A-Z]+)\\1");
        Matcher capitalMatcher = capital.matcher(firstPart);
        String capitalLetters = "";
        if (capitalMatcher.find()) {
            capitalLetters = capitalMatcher.group("capital");
        }

        Map<String, Integer> letterCount = new LinkedHashMap<>();
        for (int i = 0; i < capitalLetters.length(); i++) {
            letterCount.put(String.valueOf(capitalLetters.charAt(i)), 0);
        }

        Pattern lengthPattern = Pattern.compile("(?<ascii>\\d+):(?<length>\\d{2})"); // (?<ascii>([7-8]\\d)|(90)|(6[5-9])):(?<length>\\d{2})
        Matcher lengthMatcher = lengthPattern.matcher(secondPart);
        while (lengthMatcher.find()) {
            String ascii = Character.toString(Integer.parseInt(lengthMatcher.group("ascii")));
            int length = Integer.parseInt(lengthMatcher.group("length"));
            letterCount.computeIfPresent(ascii, (k, v) -> length); //това много не го разбирам
        }
        letterCount.forEach((k, v) -> {
            Pattern word = Pattern.compile("(?<!\\S)" + k + "\\S{" + v + "}(?!\\S)"); // това много не го разбирам
            Matcher wordMatcher = word.matcher(thirdPart);
            if (wordMatcher.find()) {
                System.out.println(wordMatcher.group());
            }
        });

    }
}