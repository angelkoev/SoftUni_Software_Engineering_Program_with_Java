package E05_MidExamPreparation14Feb2022;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#1
public class E02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shotCount = 0;

//        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] targets = nextIntArray(scanner, " ");

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            int targetIndex = Integer.parseInt(command);

            if (isValidIndex(targets, targetIndex)) {
                int shotTarget = targets[targetIndex];
                if (shotTarget != -1) {
                    shotCount++;
                    targets[targetIndex] = -1;
                    registerTargetHit(targets, shotTarget);
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", shotCount);
        printArray(targets, " ");

    }

    private static void registerTargetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if (targets[i] != -1) {
                if (targets[i] > shotTarget) {
                    targets[i] -= shotTarget;
                } else {
                    targets[i] += shotTarget;
                }
            }
        }
    }

    private static boolean isValidIndex(int[] array, int targetIndex) {
        return targetIndex >= 0 && targetIndex < array.length;
    }

    private static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.printf(separator);
            }
        }
        System.out.println();
    }

    private static int[] nextIntArray(Scanner scanner, String separator) {
        String[] intsAsString = scanner.nextLine().split(separator);
        int[] array = new int[intsAsString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intsAsString[i]);
        }
        return array;
    }
}
