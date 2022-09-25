package E03_Arrays_Lab;

import java.util.Scanner;

public class E04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split(" ");

        for (int i = 0; i < numbersAsStrings.length / 2; i++) {
            int otherIndex = numbersAsStrings.length - 1 - i;
            String otherNumber = numbersAsStrings[i];
            numbersAsStrings[i] = numbersAsStrings[otherIndex];
            numbersAsStrings[otherIndex] = otherNumber;
        }
        System.out.println(String.join(" ", numbersAsStrings));
    }
}
