package E05_MidExamRetake03;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#1
public class E02ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int count = 0;

        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);

            if (isIndexValid(shotIndex, targets.length) && targets[shotIndex] != -1) {
                int currentValue = targets[shotIndex];
                targets[shotIndex] = -1;
                count++;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] == -1) {
                        continue;
                    } else if (targets[i] > currentValue) {
                        targets[i] -= currentValue;
                    } else {
                        targets[i] += currentValue;
                    }

                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", count);
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i] + " ");
        }
    }

    public static boolean isIndexValid(int index, int size) {
        return 0 <= index && index < size;
    }
}
