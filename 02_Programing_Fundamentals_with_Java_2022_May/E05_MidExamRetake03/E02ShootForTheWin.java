package E05_MidExamRetake03;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#1
public class E02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int count = 0;

        while (!input.equals("End")) {
            int targetIndex = Integer.parseInt(input);

            if (isIndexValid(targets, targetIndex)) {
                count++;
                int temp = targets[targetIndex];
                targets[targetIndex] = -1;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] != -1) {
                        if (temp < targets[i]) {
                            targets[i] -= temp;
                        } else {
                            targets[i] += temp;
                        }
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

    public static boolean isIndexValid(int[] array, int index) {
        return index >= 0 && index < array.length;
    }
}
