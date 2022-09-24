package E03_Arrays_Lab;

import java.util.Scanner;

public class E03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split(" ");

        int sum = 0;

        for (int i = 0; i < numbersAsStrings.length; i++) {
            int currentNumber = Integer.parseInt(numbersAsStrings[i]);
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
        }
        System.out.println(sum);
    }
}
