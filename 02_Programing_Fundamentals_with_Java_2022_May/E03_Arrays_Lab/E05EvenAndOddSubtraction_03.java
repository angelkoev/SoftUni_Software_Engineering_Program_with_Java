package E03_Arrays_Lab;

import java.util.Scanner;

public class E05EvenAndOddSubtraction_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] numbersAsStrings = line.split("\\s+");

        int[] sums = new int[2];

        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
           sums[number % 2] += number;
        }

        System.out.println(sums[0] - sums[1]);
    }
}
