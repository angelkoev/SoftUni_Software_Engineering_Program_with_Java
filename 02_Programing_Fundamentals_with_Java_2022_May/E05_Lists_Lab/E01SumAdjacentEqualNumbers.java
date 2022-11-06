package E05_Lists_Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = nextLineOfDoubles(scanner);

        List<Double> nextNumbers = sumAdjacentEqualNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentEqualNumbers(numbers);
        }

        String output = joinElementsbyDelimiter (numbers, " ");
        System.out.println(output);



    }

    private static String joinElementsbyDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }


    private static List<Double> sumAdjacentEqualNumbers(List<Double> numbers) {
        List<Double> nextNumbers = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()) {
            if (i < numbers.size() - 1 && numbers.get(i).equals(numbers.get(i + 1))) {
                nextNumbers.add(numbers.get(i) + numbers.get(i + 1));
                i+=2;
            } else {
                nextNumbers.add(numbers.get(i));
                i++;
            }
        }
        return nextNumbers;

    }

    private static List<Double> nextLineOfDoubles(Scanner scanner) {
        List<Double> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        for (String s : numbersAsString) {
            numbers.add(Double.parseDouble(s));
        }
        return numbers;
    }


}
