package E05_MidExamRetake06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/1773#1
public class E02TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

//        List<String> steal = new ArrayList<>();

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
                    if (index > 0 && index < initialLoot.size()) {
                        String temp = initialLoot.get(index);
                        initialLoot.remove(index);
                        initialLoot.add(temp);
                    }
                    break;
                case "Steal":
                    int countToRemove = Integer.parseInt(data[1]);
                    int min = Math.min(initialLoot.size(), countToRemove);
                    for (int i = 0; i < min; i++) {
//                        steal.add(initialLoot.get(initialLoot.size() - min + i));
                        System.out.print(initialLoot.get(initialLoot.size() - min + i));
                        if (i != min - 1) {
                            System.out.print(", ");
                        }
                        initialLoot.remove(initialLoot.size() - min + i);
                    }
                    System.out.println();
//                    System.out.println(String.join(", ", steal));
//                    steal.clear(); // трябва да го чистим, защото ако има стари елементи от преди това и почва да се бърка.
                    break;
            }

            input = scanner.nextLine();
        }

        if (initialLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int totalLength = 0;
            for (int i = 0; i < initialLoot.size(); i++) {
                totalLength = totalLength + initialLoot.get(i).length();
            }
            double average = totalLength * 1.0 / initialLoot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", average);
        }

    }
}
