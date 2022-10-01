package E03_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class HowToParseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        double[] numbersD = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        char[] symbols = scanner.nextLine().toCharArray();

    }

}
