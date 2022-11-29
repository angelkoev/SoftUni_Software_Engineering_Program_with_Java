package E05_MidExamPreparation14Feb2022;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#1
public class E02ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        int countShotTargets = 0;

        while (!input.equals("End")) {

            int index = Integer.parseInt(input);

            if (isValidIndex(index, targets.length)) {
                countShotTargets++;
                int value = targets[index];
                targets[index] = -1;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] != -1) {
                        if (targets[i] > value) {
                            targets[i] -= value;
                        } else {
                            targets[i] += value;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", countShotTargets);
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i] + " ");
        }

    }

    public static boolean isValidIndex(int index, int listSize) {
        return index >= 0 && index < listSize;
    }
}
