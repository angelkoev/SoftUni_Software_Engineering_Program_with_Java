package E05_MidExamRetake03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2305#2
public class E03MovingTarget_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String commandName = data[0];
            int index = Integer.parseInt(data[1]);
            int value = Integer.parseInt(data[2]);

            switch (commandName) {
                case "Shoot":
                    if (isValidIndex(index, targets.size())) {
                        int currentValue = targets.get(index) - value;
                        if (currentValue <= 0) {
                            targets.remove(index);
                        } else {
                            targets.set(index, currentValue);
                        }
                    }
                    break;
                case "Add":
                    if (isValidIndex(index, targets.size())) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int start = index - value;
                    int end = index + value;
                    if (isStrikeValid(start, end, targets.size())) {
                        for (int i = start; i <= end; i++) {
                            targets.remove(start);
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
            if (i != targets.size() -1 ) {
                System.out.print("|");
            }
        }

    }

    public static boolean isValidIndex(int index, int size) {
        return 0 <= index && index < size;
    }

    public static boolean isStrikeValid(int start, int end, int size) {
        return start < end && 0 <= start && start < size;
    }
}
