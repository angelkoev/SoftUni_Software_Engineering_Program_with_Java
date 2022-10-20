package E04_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallestNum = getSmallestNumber(num1, num2, num3);

        System.out.println(smallestNum);

//        System.out.println(Math.min(Math.min(num1, num2), num3));  // и така работи !!!


    }

    private static int getSmallestNumber(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        return numbers[0];
    }

}
