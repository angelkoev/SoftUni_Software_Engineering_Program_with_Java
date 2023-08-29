package E10_ExamPreparation_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://judge.softuni.org/Contests/Practice/Index/2525#1
public class E02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([|#])(?<name>[A-zA-z\\s]+)\\1(?<date>[\\d]{2}[\\/]{1}[\\d]{2}[\\/]{1}[\\d]{2})\\1(?<calories>[\\d]{1,5})\\1");
//        Pattern pattern = Pattern.compile("([|#])(?<name>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
//        Pattern pattern = Pattern.compile("([#|])(?<name>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        List<Food> foods = new LinkedList<>();

        while (matcher.find()) {
            String productName = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
//            System.out.println(productName + " " + date + " " + calories);
            Food food = new Food(productName, date, calories);
            foods.add(food);
        }

        int days = foods.stream().mapToInt(Food::getCalories).sum() / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);

        foods.forEach(System.out::println);

    }

    static class Food {
        String name;
        String date;
        int calories;

        public Food(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d", this.name, this.date, this.calories);
        }
    }

}
