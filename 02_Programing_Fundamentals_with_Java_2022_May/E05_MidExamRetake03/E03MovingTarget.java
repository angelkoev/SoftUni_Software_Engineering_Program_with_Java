package E05_MidExamRetake03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2305#2
public class E03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] command = input.split("\\s+");
            String action = command[0];
            int index = Integer.parseInt(command[1]);
            int power = Integer.parseInt(command[2]);

            switch (action) {
                case "Shoot":
                    if (isIndexValid(targets, index)) {
                        if (targets.get(index) - power > 0) {
                            targets.set(index, targets.get(index) - power);
                        } else {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (isIndexValid(targets, index)) {
                        targets.add(index, power);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (isIndexValidForStrike(targets, index, power)) {
                        for (int i = 0; i < 2 * power + 1; i++) {
                            targets.remove(index - power);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }


            input = scanner.nextLine();
        }


        for (int i = 0; i < targets.size(); i++) {
            System.out.print(targets.get(i));
            if (i != targets.size() - 1) {
                System.out.print("|");
            }
        }

    }

    public static boolean isIndexValid(List<Integer> array, int index) {
        return index >= 0 && index < array.size();
    }

    public static boolean isIndexValidForStrike(List<Integer> array, int index, int power) {
        return index - power >= 0 && index + power >= 0&& index + power < array.size() && index - power < array.size();
    }

}
