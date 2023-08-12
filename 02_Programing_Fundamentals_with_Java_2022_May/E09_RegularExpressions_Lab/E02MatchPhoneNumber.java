package E09_RegularExpressions_Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([ -])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones = scanner.nextLine();

        List<String> matchedPhones = new LinkedList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phones);

        while (phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group());
        }

        System.out.println(String.join(", ", matchedPhones));

    }
}
