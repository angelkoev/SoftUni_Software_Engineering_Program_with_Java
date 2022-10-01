package E03_Arrays_Lab;

import java.util.Scanner;

public class E07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbersString = input.split("\\s+");

        int[] numbers = new int[numbersString.length];

        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        for (int repetitions = 0; repetitions < numbers.length - 1; repetitions++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i] + numbers[i + 1];
            }
        }
        System.out.println(numbers[0]);
    }
}
