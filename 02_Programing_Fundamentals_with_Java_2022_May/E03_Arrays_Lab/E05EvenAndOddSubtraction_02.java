package E03_Arrays_Lab;

import java.util.Scanner;

public class E05EvenAndOddSubtraction_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] numbersAsStrings = line.split("\\s+");

        int evenSum = 0;
        int oddSum = 0;

        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
