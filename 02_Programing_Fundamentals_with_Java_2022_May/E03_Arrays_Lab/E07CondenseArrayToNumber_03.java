package E03_Arrays_Lab;

import java.util.Scanner;

public class E07CondenseArrayToNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split("\\s+");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }

        System.out.println(numbers[0]);

    }
}
