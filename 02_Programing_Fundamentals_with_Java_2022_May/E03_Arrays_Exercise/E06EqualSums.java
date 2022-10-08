package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                int currentNumber = array[j];
                leftSum += currentNumber;
            }
            for (int j = i + 1; j < array.length; j++) {
                int currentNumber = array[j];
                rightSum += currentNumber;
            }
            if (leftSum == rightSum) {
                isFound = true;
                System.out.println(i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }

    }
}
