package E09_RegularExpressions_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01WinningTicket_taraskonski {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        String[] ticket = input.split("[, ]+");

        for (int i = 0; i < ticket.length; i++) {

            if (ticket[i].length() == 20) {
                String tickets = ticket[i];
                String leftString = tickets.substring(0, 10);
                String rightString = tickets.substring(10);
                String leftCorrespond = "a";
                String rightCorrespond = "s";

                Pattern pattern = Pattern.compile("[\\@]{6,}|[\\$]{6,}|[\\#]{6,}|[\\^]{6,}");
                Matcher leftMatcher = pattern.matcher(leftString);
                Matcher rightMatcher = pattern.matcher(rightString);
                if (leftMatcher.find()) {
                    leftCorrespond = leftMatcher.group();
                }
                if (rightMatcher.find()) {
                    rightCorrespond = rightMatcher.group();
                }

                if (leftCorrespond.substring(0, 1).equals(rightCorrespond.substring(0, 1))) {
                    int matchCount = Math.min(leftCorrespond.length(), rightCorrespond.length());

                    if (matchCount == 10) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", tickets, matchCount, leftCorrespond.substring(0, 1));
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s%n", tickets, matchCount, leftCorrespond.substring(0, 1));

                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", tickets);
                }

            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
