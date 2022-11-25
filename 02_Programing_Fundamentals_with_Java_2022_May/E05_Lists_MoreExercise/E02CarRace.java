package E05_Lists_MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int loopLenght = numbers.size() / 2;

        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < loopLenght; i++) {
            int leftCurrentNum = Integer.parseInt(numbers.get(i));
            int rightCurrentNum = Integer.parseInt(numbers.get(numbers.size() - 1 - i));

            if (leftCurrentNum == 0) {
                leftSum *= 0.8;
            } else {
            leftSum += leftCurrentNum;
            }

            if (rightCurrentNum == 0) {
                rightSum *= 0.8;
            } else {
            rightSum += rightCurrentNum;
            }

        }

        if (leftSum < rightSum) {
            System.out.printf("The winner is left with total time: %.1f", leftSum);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightSum);
        }

    }
}
