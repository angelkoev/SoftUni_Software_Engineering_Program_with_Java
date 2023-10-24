package E10_FinalExamRetake04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02FancyBarcodes_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String text = scanner.nextLine();

            String regex = "@#+(?<item>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {

                String newText = matcher.group("item");

                String digitRegex = "\\d+";
                Pattern digitPattern = Pattern.compile(digitRegex);
                Matcher digitMatcher = digitPattern.matcher(newText);

                String group = "";

                while (digitMatcher.find()) {
                    group += digitMatcher.group();
                }
                if (group.length() == 0) {
                    group = "00";
                }

                System.out.println("Product group: " + group);

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
