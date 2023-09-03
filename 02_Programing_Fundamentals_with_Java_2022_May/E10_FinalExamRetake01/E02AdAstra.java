package E10_FinalExamRetake01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Food> allItems = new ArrayList<>();

        String regex = "([|#])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})?\\1(?<calories>[0-9]{1,5})\\1";

        Pattern patternFood = Pattern.compile(regex);

        Matcher matcherFood = patternFood.matcher(input);

        int totalCalories = 0;

        while (matcherFood.find()) {
            String foodName = matcherFood.group("itemName");
            String expirationDate = matcherFood.group("expirationDate");
            int calories = Integer.parseInt(matcherFood.group("calories"));
            totalCalories += calories;
            Food newFood = new Food(foodName, expirationDate, calories);
            allItems.add(newFood);

        }

        int daysWithFood = totalCalories / 2000;

        System.out.println("You have food to last you for: " + daysWithFood + " days!");

        if (allItems.size() > 0) {
            for (Food allItem : allItems) {
                System.out.println(allItem);
            }
        }


    }

    public static class Food {
        String foodName;
        String expirationDate;
        int calories;

        public Food(String foodName, String expirationDate, int calories) {
            this.foodName = foodName;
            this.expirationDate = expirationDate;
            this.calories = calories;
        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d", this.foodName, this.expirationDate, this.calories);
        }
    }
}
