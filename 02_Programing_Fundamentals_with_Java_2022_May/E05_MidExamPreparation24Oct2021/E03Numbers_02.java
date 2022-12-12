package E05_MidExamPreparation24Oct2021;

import java.util.*;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2474#2
public class E03Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numbers);
        Collections.reverse(numbers);

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        double average = sum * 1.0 / numbers.size();

        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > average) {
                result.add(number);
            }
        }

        if (result.isEmpty()) {
            System.out.println("No");
        } else if (result.size() > 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(result.get(i) + " ");
            }
        } else {
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
        }

    }
}
