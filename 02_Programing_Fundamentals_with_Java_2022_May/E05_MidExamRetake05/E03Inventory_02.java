package E05_MidExamRetake05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2028#2
public class E03Inventory_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] data = input.split(" - ");
            String command = data[0];
            String item = data[1];
            switch (command) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    items.remove(item);
                    break;
                case "Combine Items":
                    String[] tokens = item.split(":");
                    if (items.contains(tokens[0])) {
                        int index = items.indexOf(tokens[0]);
                        items.add(index + 1, tokens[1]);
                        }
                    break;
                case "Renew":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", items));


    }
}
