package E05_MidExamPreparation24Oct2021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2031#1
public class E02ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] commands = input.split(" ");
            String commandName = commands[0];
            String item = commands[1];
            switch (commandName) {
                case "Urgent":
                    if (initialList.contains(item)) {
                        input = scanner.nextLine();
                        continue;
                    } else {
                        initialList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    initialList.remove(item);
                    break;
                case "Correct":
                    if (initialList.contains(item)) {
                        int indexForTheNewItem = initialList.indexOf(item);
                        String newItem = commands[2];
                        initialList.set(indexForTheNewItem, newItem);

                    }
                    break;
                case "Rearrange":
                    if (initialList.contains(item)) {
                        initialList.remove(item);
                        initialList.add(item);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

       String finalStringToPrint = initialList.toString().replaceAll("[\\[\\]]", "");
        System.out.println(finalStringToPrint);

    }
}
