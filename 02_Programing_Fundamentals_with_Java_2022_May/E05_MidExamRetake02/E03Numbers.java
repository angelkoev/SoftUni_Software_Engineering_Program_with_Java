package E05_MidExamRetake02;

import java.util.*;

// https://judge.softuni.org/Contests/Practice/Index/2474#2
public class E03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sumArr = 0;
        double averageArr = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumArr += numbers[i];
        }

        averageArr = sumArr * 1.0 / numbers.length;

        List<Integer> greaterNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > averageArr) {
                greaterNumbers.add(numbers[i]);
            }
        }

        Collections.sort(greaterNumbers);
        Collections.reverse(greaterNumbers);

        if (greaterNumbers.isEmpty()) {
            System.out.println("No");
        } else if (greaterNumbers.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.printf(greaterNumbers.get(i) + " ");
            }
        } else {
            for (int i = 0; i < greaterNumbers.size(); i++) {
                System.out.printf(greaterNumbers.get(i) + " ");
            }
        }


    }
}
