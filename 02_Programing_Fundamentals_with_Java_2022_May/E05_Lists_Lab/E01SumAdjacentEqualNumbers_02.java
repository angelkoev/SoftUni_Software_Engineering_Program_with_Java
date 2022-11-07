package E05_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01SumAdjacentEqualNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                Double sum = numbers.get(i) + numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, sum);
                i = -1;
            }
        }

//        String output = joinElementsbyDelimiter (numbers, " ");
//        System.out.println(output);



        for (Double number : numbers) {
            if (number % 1 != 0) {
                System.out.printf("%.1f ", number);
            } else {
                System.out.printf("%d ", number.longValue());
            }
        }

    }
//    private static String joinElementsbyDelimiter(List<Double> items, String delimiter) {
//        String output = "";
//        for (Double item : items) {
//            output += (new DecimalFormat("0.#").format(item) + delimiter);
//        }
//        return output;
//    }
}
