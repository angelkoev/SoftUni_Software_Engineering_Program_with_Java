package E05_MidExamRetake06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/1773#1
public class E02TreasureHunt_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Loot":
                    for (int i = 1; i < data.length; i++) {
                        if (!initialLoot.contains(data[i])) {
                            initialLoot.add(0, data[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(data[1]);
                    if (0 <= index && index < initialLoot.size()) {
                        String temp = initialLoot.get(index);
                        initialLoot.remove(index);
                        initialLoot.add(temp);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(data[1]);
                    int min = Math.min(count, initialLoot.size());
                    for (int i = 0; i < min; i++) {
                        System.out.print(initialLoot.remove(initialLoot.size() - min + i));
                        if (i < min - 1) {
                            System.out.printf(", ");
                        }
                    }
                    System.out.println();
                    break;
            }


            input = scanner.nextLine();
        }

        int sum = 0;
        for (String s : initialLoot) {
            sum += s.length();
        }
        double average = sum * 1.0 / initialLoot.size();

        if (initialLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }

    }
}
