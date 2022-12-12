package E05_MidExamPreparation24Oct2021;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2474#2
public class E03Numbers_02_With_Streams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numbers);
        Collections.reverse(numbers);

        Function<List<Integer>, Integer> sumAllElements = l -> l.stream().mapToInt(e -> e).sum();

        Consumer<Integer> printer = number -> System.out.printf("%d ", number);
        int sum = sumAllElements.apply(numbers);
        Double average = sum * 1.0 / numbers.size();

        Predicate<Integer> predicate = number -> number > average;

        List<Integer> result = numbers.stream().filter(predicate).limit(5).collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("No");
        } else {
            result.forEach(printer);
        }

    }
}
