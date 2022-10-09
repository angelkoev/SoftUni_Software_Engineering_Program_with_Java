package E03_Arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10TreasureHunt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        List<String> steal = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        String lootItem = command[i];
                        if (!initialLoot.contains(lootItem)) {
                            initialLoot.add(0, lootItem);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (isIndexValid(initialLoot, index)) {
                        String temp = initialLoot.get(index);
                        initialLoot.remove(index);
                        initialLoot.add(temp);
                    }
                    break;
                case "Steal":

                    int stealCount = Integer.parseInt(command[1]);
                    int smallest = Math.min(stealCount, initialLoot.size());
                    for (int i = 0; i < smallest; i++) {
                        steal.add(initialLoot.get(initialLoot.size() - smallest + i));
                        initialLoot.remove(initialLoot.size()  - smallest + i);
                    }
                    System.out.println(String.join(", ", steal));

                    steal.clear();
// това горното с листа и после .clear(); го видях от тук -> https://softuni.bg/forum/40552/treasure-hunt-mid-exam-csharp-fundamentals
// първоначално (по-долу кода) беше без масив и си принтраше директно, без да триябва да се занулява масив, но явно нещо се бърка.
                    // може би някъде трябва да има нов ред или пък не... знам ли.
                    // друг вариант е вместо clear();, да правим масива при командата Steal
                    // така при всяко срещане на командата Steal, ще започваме с празен масив/лист

//                    int stealCount = Integer.parseInt(command[1]);
//                    int smallest = Math.min(stealCount, initialLoot.size());
//                    for (int i = 0; i < smallest; i++) {
//                        System.out.print(initialLoot.get(initialLoot.size() - smallest + i));
//                        if (initialLoot.size() - smallest + i < initialLoot.size() - 1) {    // тука бая време я налучквах тази проверка
//                            System.out.print(", ");                                          // за да не печата на последното ", "
//                        }
//                        initialLoot.remove(initialLoot.size() - smallest + i);
//                    }
////                    System.out.println(); с това дава 30/100, без него дава 70/100
//                    break;
            }

            input = scanner.nextLine();
        }


        int size = 0;

        for (int i = 0; i < initialLoot.size(); i++) {
            int itemLenght = initialLoot.get(i).length();
            size += itemLenght;
        }

        double average = size * 1.0 / initialLoot.size();

        if (initialLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }

    }

    public static boolean isIndexValid(List<String> array, int index) {
        return index >= 0 && index < array.size();
    }
}
