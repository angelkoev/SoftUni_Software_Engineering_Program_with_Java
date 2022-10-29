package E04_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

//    https://youtu.be/Auk_w7t2Kp4?t=6061
//    https://judge.softuni.org/Contests/Practice/Index/1286#10


public class E11ArrayManipulator_Adriana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] inputArray = scanner.nextLine().split("\\s+");
//
//        int[] numbers = new int[inputArray.length];
//        for (int i = 0; i < inputArray.length; i++) {
//            numbers[i] = Integer.parseInt(inputArray[i]);
//        }

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(inputArray[1]);
                    if (index >= 0 && index < numbers.length) {
                        exchangeArray(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (inputArray[1].equals("odd")) {
                        System.out.println(findMaxOddElementIndex(numbers));
                    } else {
                        System.out.println(findMaxEvenElementIndex(numbers));
                    }
                    break;
                case "min":
                    if (inputArray[1].equals("odd")) {
                        System.out.println(findMinOddElementIndex(numbers));
                    } else {
                        System.out.println(findMinOddElementIndex(numbers));
                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(inputArray[1]);
                    if (countFirst > numbers.length) {
                        System.out.println("Invalid count");
                    } else if (inputArray[2].equals("odd")) {

                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(inputArray[1]);
                    if (countLast > numbers.length) {
                        System.out.println("Invalid count");
                    } else if (inputArray[2].equals("odd")) {

                    }
                    break;
            }


            input = scanner.nextLine();
        }


        System.out.println(Arrays.toString(numbers));


    }

    private static void exchangeArray(int[] arr, int index) {
        // [1, 2, 3, 4, 5] => exchange 2 => [4, 5, 1, 2, 3]
        int[] first = new int[index + 1];
        int[] second = new int[arr.length - (index + 1)];

        for (int i = 0; i <= index; i++) {
            first[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            second[i - (index + 1)] = arr[i];
        }
        for (int i = 0; i < second.length; i++) {
            arr[i] = second[i];
        }
        for (int i = 0; i < first.length; i++) {
            arr[i + second.length] = first[i];
        }
    }

    private static int findMaxOddElementIndex(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxElement) {
                maxElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxEvenElementIndex(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxElement) {
                maxElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinOddElementIndex(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minElement) {
                minElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinEvenElementIndex(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minElement) {
                minElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static void printLastEvenNumsCount(int[] arr, int count) {
        int[] numbers = new int[arr.length];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] % 2 == 0) {
                numbers[i] = arr[i];
                count--;
            }
        }
    }
}
