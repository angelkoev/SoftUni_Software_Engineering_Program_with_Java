package E08_TextProcessing_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("find")) {
            StringBuilder text = new StringBuilder();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                char result = (char) (input.charAt(i) - key[count]);
                text.append(result);
                count++;
                if (count == key.length) {
                    count = 0;
                }
            }
            String itemFound = text.substring(text.indexOf("&") + 1, text.lastIndexOf("&"));
            String coordinates = text.substring(text.indexOf("<") + 1, text.lastIndexOf(">"));
            System.out.printf("Found %s at %s%n", itemFound, coordinates);

            input = scanner.nextLine();
        }

    }
}
