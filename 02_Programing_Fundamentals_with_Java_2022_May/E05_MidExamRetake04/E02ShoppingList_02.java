package E05_MidExamRetake04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2031#1
public class E02ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] data = input.split(" ");
            String action = data[0];
            String item = data[1];

            switch (action) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    shoppingList.remove(item);
                    break;
                case "Correct":
                    String newItem = data[2];
                    if (shoppingList.contains(item)) {
                        int newIndex = shoppingList.indexOf(item);
                        shoppingList.set(newIndex, newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", shoppingList));

    }
}
