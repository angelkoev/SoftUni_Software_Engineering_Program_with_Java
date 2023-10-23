package E10_FinalExamRetake04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String itemRegex = "[@][#]+(?<item>[A-Z][a-zA-Z0-9]{4,}[A-Z])[@][#]+";

            Pattern pattern = Pattern.compile(itemRegex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String item = matcher.group("item");
                String digitRegex = "\\d+";
                Pattern digitPattern = Pattern.compile(digitRegex);
                Matcher digitMatcher = digitPattern.matcher(item);
                StringBuilder groupId = new StringBuilder();
                while (digitMatcher.find()) {
                    groupId.append(digitMatcher.group());
                }
                if (groupId.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + groupId);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
