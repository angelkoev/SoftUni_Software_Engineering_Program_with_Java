package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userPoints = new LinkedHashMap<>();

        Map<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {

            String[] data = input.split("-");
            String username = data[0];
            String language = data[1];
            int points = 0;
            if (!language.equals("banned")) {
                points = Integer.parseInt(data[2]);
            }

            userPoints.putIfAbsent(username, 0);
            if (points > userPoints.get(username)) {
                userPoints.put(username, points);
            }

            if (language.equals("banned")) {
                userPoints.remove(username);
            } else {
                languageCount.putIfAbsent(language, 0);
                languageCount.put(language, languageCount.get(language) + 1);
            }

            input = scanner.nextLine();
        }


        System.out.println("Results:");

        userPoints.entrySet()
                .stream().forEach((e -> System.out.printf("%s | %s%n", e.getKey(), e.getValue())));
        System.out.println("Submissions:");
        languageCount.entrySet()
                .stream().forEach((e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue())));

//        System.out.println("Results:");
//        userPoints.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

//        System.out.println("Submissions:");
//        languageCount.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}
