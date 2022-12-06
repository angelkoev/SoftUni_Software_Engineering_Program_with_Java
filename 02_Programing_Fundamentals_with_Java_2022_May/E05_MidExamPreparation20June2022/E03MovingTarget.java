package E05_MidExamPreparation20June2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2305#2
public class E03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String command = data[0];
            int index = Integer.parseInt(data[1]);
            int value = Integer.parseInt(data[2]);

            switch (command) {
                case "Shoot":
                    if (isIndexValid(index, targets.size())) {
                        int currentValue = targets.get(index);
                        if (currentValue > value) {
                            currentValue -= value;
                            targets.set(index, currentValue);
                        } else {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (isIndexValid(index, targets.size())) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (isIndexValid(index - value, targets.size()) && isIndexValid(index + value, targets.size())) {
                        int start = index - value;
                        int end = index + value;
                        int removeCount = end - start + 1; // даде 100/100, ама това не е написано много добре
                        for (int i = start; removeCount != 0; removeCount--) {
                            targets.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }

                    break;
            }


            input = scanner.nextLine();
        }

        String result = String.format(targets.toString().replaceAll(", ", "|"));
        result = result.replaceAll("[\\[\\]]", "");
        System.out.println(result);
    }

    public static boolean isIndexValid(int index, int size) {
        return 0 <= index && index < size;
    }
}
