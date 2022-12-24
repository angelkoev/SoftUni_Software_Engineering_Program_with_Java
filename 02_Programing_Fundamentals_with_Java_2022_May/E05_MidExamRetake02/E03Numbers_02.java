package E05_MidExamRetake02;

import java.util.*;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2474#2
public class E03Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double average = numbers.stream().mapToDouble(a -> a).average().getAsDouble();

        List<Integer> greaterThanAverage = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > average) {
                greaterThanAverage.add(number);
            }
        }

        Collections.sort(greaterThanAverage);
        Collections.reverse(greaterThanAverage);

        int minSize = Math.min(greaterThanAverage.size(), 5);

        for (int i = 0; i < minSize; i++) {
            System.out.print(greaterThanAverage.get(i) + " ");
        }

        if (greaterThanAverage.isEmpty()) {
            System.out.println("No");
        }

    }
}
