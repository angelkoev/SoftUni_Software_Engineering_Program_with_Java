package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (String s : text) {
            for (int i = 0; i < s.length(); i++) {
                char symbol = s.charAt(i);
                if (!result.containsKey(symbol)) {
                    result.put(symbol, 1);
                } else {
                    result.put(symbol, result.get(symbol) + 1);
                }
            }
        }

        result.forEach((key, value) -> System.out.printf("%c -> %d%n", key, value));

    }
}
