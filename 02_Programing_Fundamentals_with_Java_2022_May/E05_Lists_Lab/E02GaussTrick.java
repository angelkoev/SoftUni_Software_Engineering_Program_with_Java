package E05_Lists_Lab;

import java.util.ArrayList;  // първо даваше 80/100
import java.util.Arrays;     // после с добавката по-долу даде 100/100
import java.util.List;
import java.util.Scanner;

public class E02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = nextLineOfInts(scanner);
        List<Integer> result = new ArrayList<Integer>();

        if (numbers.size() > 1) {
            for (int i = 0; i < numbers.size() / 2; i++) {
                int sum = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
                result.add(sum);
//            if (numbers.get(i) == numbers.get(numbers.size() - 1 - i)) {
//                result.add(numbers.get(i));
//            }
//            result.remove(result.size() - 1);
            }
        }

//        System.out.println(numbers.size());
//        System.out.println(numbers.size() / 2);
//
//        System.out.println(numbers.size() / 2 + 1);

        if (numbers.size() % 2 != 0) {
            int middleIndex = numbers.size() / 2;   // с тази промяна ми даде 100/100
//            System.out.println(numbers.get(middleIndex));
            result.add(numbers.get(middleIndex));
        }

        if (numbers.size() > 1) {
            for (Integer n : result) {
                System.out.print(n + " ");
            }
        } else {
            System.out.println(numbers.get(0));
        }

    }

    private static List<Integer> nextLineOfInts(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        for (String s : numbersAsString) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

}
