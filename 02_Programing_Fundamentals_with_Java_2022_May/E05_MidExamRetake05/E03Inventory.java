package E05_MidExamRetake05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2028#2
public class E03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] commands = input.split(" - ");

            String action = commands[0];
            String item = commands[1];

            switch (action) {
                case "Collect":
                    if (!itemList.contains(item)) {
                        itemList.add(item); //add добавя в края, а аз мислех, че добавя в началото !!!
                    }
                    break;
                case "Drop":
                    itemList.remove(item);
                    break;
                case "Combine Items":

                    String[] items = commands[1].split(":");
                    String item1 = items[0];
                    String item2 = items[1];
                    if (itemList.contains(item1)) {
                        int index = itemList.indexOf(item1);
                        itemList.add(index + 1, item2);
                    }
                    break;
                case "Renew":
                    if (itemList.contains(item)) {
                        itemList.remove(item);
                        itemList.add(item);

                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", itemList));

    }
}
