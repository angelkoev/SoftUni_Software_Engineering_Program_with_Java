package E09_RegularExpressions_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// от espinoza81 с малки промени
public class E02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern symbol = Pattern.compile("(?<symbol>[^0-9]+)(?<number>[\\d]+)"); //"(?<symbol>[^\\d]+)(?<number>\\d+)"
        Matcher symbolFind = symbol.matcher(input);
        StringBuilder message = new StringBuilder();
        StringBuilder uniquyeSymbols = new StringBuilder();
        while (symbolFind.find()) {
            String rageQuit = symbolFind.group("symbol").toUpperCase();
            int number = Integer.parseInt(symbolFind.group("number"));
            if (number == 0) {
                continue;
            }
            for (int i = 0; i < rageQuit.length(); i++) {
                char singleSymbol = rageQuit.charAt(i);

                if (uniquyeSymbols.indexOf(String.valueOf(singleSymbol)) == -1) {
                    uniquyeSymbols.append(singleSymbol);
                }
            }
            message.append(rageQuit.repeat(number));
            //  messages.append(rageQuit.repeat(Math.max(0, number)));
        }
        System.out.printf("Unique symbols used: %d%n", uniquyeSymbols.length());
        System.out.println(message);

    }
}