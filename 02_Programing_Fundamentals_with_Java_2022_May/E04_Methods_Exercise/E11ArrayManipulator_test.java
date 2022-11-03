package E04_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/1286#10

public class E11ArrayManipulator_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split(" ");
            //командите са exchange, max, min, first, last
            String type = tokens[0];

            switch (type) {
                case "exchange":
                    // exchange 2 -> ["exchange", "2"]
                    int index = Integer.parseInt(tokens[1]);
                    // 2 масива: до интекса; след индекса;
                    if (validateIndex(index, numbers.length)) {
//                        int[] exchangedArrat = new int[numbers.length];
//                        for (int i = 0; i < exchangedArrat.length; i++) {
//                            for (int j = 0; j <= index; j++) {
//                                int number = numbers[i];
//                                exchangedArrat[i] = number;
//                            }
//                            for (int j = index + 1; j <= numbers.length - 1; j++) {
//                                int number = numbers[i];
//                                exchangedArrat[i] = number;
//                            }
//                        }

                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    // max even -> ["max", "even"]
                    if (tokens[1].equals("even")) {
                        printMaxEvenElementIndex(numbers);
                    } else if (tokens[1].equals("odd")) {
                        printMaxOddElementIndex(numbers);
                    }
                    break;
                case "min":
                    // min even -> ["min", "even"]
                    if (tokens[1].equals("even")) {
                        printMinEvenElementIndex(numbers);
                    } else if (tokens[1].equals("odd")) {
                        printMinOddElementIndex(numbers);
                    }
                    break;
                case "last":
                    break;
                case "first":
                    break;
            }


            command = scanner.nextLine();
        }


    }

    private static void printMinOddElementIndex(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int minOddNumberIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 2 == 1 && number <= minOdd) {
                minOdd = number;
                minOddNumberIndex = i;
            }
        }
        System.out.println(minOddNumberIndex);
    }

    private static void printMinEvenElementIndex(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int minEvenNumberIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 2 == 0 && number <= minEven) {
                minEven = number;
                minEvenNumberIndex = i;
            }
        }
        System.out.println(minEvenNumberIndex);
    }

    private static void printMaxOddElementIndex(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxOddNumberIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 2 == 1 && number >= maxOdd) {
                maxOdd = number;
                maxOddNumberIndex = i;
            }
        }
        System.out.println(maxOddNumberIndex);
    }

    private static void printMaxEvenElementIndex(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int maxEvenNumberIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 2 == 0 && number >= maxEven) {
                maxEven = number;
                maxEvenNumberIndex = i;
            }
        }
        System.out.println(maxEvenNumberIndex);
    }

    private static boolean validateIndex(int index, int lenght) {
        return index >= 0 && index <= lenght - 1;
//        if (index >= 0 && index <= lenght - 1) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
