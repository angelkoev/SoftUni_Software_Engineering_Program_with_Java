package E03_Arrays_Lab;

import java.util.Scanner;

public class LongestSequenceOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split("\\s+");

        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int longestLength = 0;
        int currentLength = 1;
        int longestIndex = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                currentLength++;
            } else {
                if (longestLength < currentLength) {
                    longestLength = currentLength;
                    longestIndex = i;
                }
                currentLength = 1;
            }
        }
        System.out.println(longestLength);

        for (int i = longestIndex - longestLength +1 ; i <= longestIndex; i++) {
            System.out.print(numbers[i] + " ");
        }
        // input = 1 1 1 2 3 1 1 1 2 1 1 2 3 4 1 1 2
        // result = 4
        // result 2 = 1 2 3 4
    }
}
