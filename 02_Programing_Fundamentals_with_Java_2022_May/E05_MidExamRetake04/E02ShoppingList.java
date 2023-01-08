package E05_MidExamRetake04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2031#1
public class E02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] commands = input.split("\\s+");

            String action = commands[0];
            String item = commands[1];

            switch (action) {
                case "Urgent":
                    if (!productList.contains(item)) {
                        productList.add(0, item); //add добавя в края, а аз мислех, че добавя в началото !!!
                    }
                    break;
                case "Unnecessary":
                    productList.remove(item);
                    break;
                case "Correct":
                    String newItem = commands[2];
                    if (productList.contains(item)) {
                        int index = productList.indexOf(item);
                        productList.set(index, newItem);
//                       productList.remove(item);
//                       productList.add(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (productList.contains(item)) {
                        productList.remove(item);
                        productList.add(item);

                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", productList));

    }
}
