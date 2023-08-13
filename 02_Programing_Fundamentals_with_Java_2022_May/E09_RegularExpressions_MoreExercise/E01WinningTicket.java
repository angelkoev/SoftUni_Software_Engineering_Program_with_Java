package E09_RegularExpressions_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// от espinoza81
public class E01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s*,\\s+");

        Pattern pattern = Pattern.compile("(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\\k<ch>{6,}).*(?<=.{10})\\k<match>.*");
        for (String s : input) {
            if (s.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                String match = matcher.group("match");
                System.out.printf("ticket \"%s\" - %d%s%s%n", s, match.length(), match.charAt(0),  (match.length() == 10) ? " Jackpot!" : "" );
            } else {
                System.out.println("ticket \"" + s + "\" - no match");
            }

        }

    }
}