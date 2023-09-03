package E10_FinalExamRetake01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02AdAstra_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([\\|#])(?<food>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        List<String> foods = new ArrayList<>();

        int totalCalories = 0;

        while (matcher.find()) {

            String food = matcher.group("food");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

//            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", food, date, calories);

            foods.add(String.format("Item: %s, Best before: %s, Nutrition: %d", food, date, calories));

            totalCalories += calories;

        }

        int days = totalCalories / 2000;

        System.out.println("You have food to last you for: " + days + " days!");

        foods.forEach(System.out::println);

//        System.out.println(String.join(System.lineSeparator(), foods));

    }
}
