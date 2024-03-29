package E09_RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String regex = "(?<=\\s)[a-zA-Z0-9]+([-.]\\w+)*@[a-zA-Z]+?([.-][a-zA-Z]*)*(\\.[a-z]{2,})";
// става и с този regex \b[A-Za-z\d]+[\.\-_]*[A-Za-z\d]+@[A-Za-z\.]+\.[A-Za-z]{2,}
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}