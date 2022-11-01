package E04_Methods_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class E11ArrayManipulator_Streams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split(" ");

            String type = tokens[0];
            switch (type) {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (validateIndex(index, numbers.size())) {
                        numbers = rotateList(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (tokens[1].equals("even")) {
                        printMaxEvenElementIndex(numbers);
                    } else if (tokens[1].equals("odd")) {
                        printMaxOddElementIndex(numbers);
                    }
                    break;
                case "min":
                    if (tokens[1].equals("even")) {
                        printMinEvenElementIndex(numbers);
                    } else if (tokens[1].equals("odd")) {
                        printMinOddElementIndex(numbers);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(tokens[1]);
                    if (tokens[2].equals("even")) {
                        firstEven(numbers, count);
                    } else if (tokens[2].equals("odd")) {
                        firstOdd(numbers, count);
                    }
                    break;
                case "last":
                    count = Integer.parseInt(tokens[1]);
                    if (tokens[2].equals("even")) {
                        lastEven(numbers, count);
                    } else if (tokens[2].equals("odd")) {
                        lastOdd(numbers, count);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers);
    }

    private static void lastOdd(List<Integer> numbers, int count) {
        List<Integer> temp = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        int minSize = Math.min(count, temp.size());
//        Collections.reverse(temp);
        if (count > numbers.size()) {
            System.out.println("Invalid count");
        } else if (temp.isEmpty()) {
            System.out.println("[]");
        } else {
            temp = temp.subList(temp.size() - minSize, temp.size());
//            List<Integer> reversedList = new ArrayList<>();
//            for (int i = minSize; i >= 0; i--) {
//                reversedList.add(temp.get(i));
//            }
//            Collections.reverse(reversedList);
            System.out.println(temp);
        }
//                System.out.println(temp);
    }

    private static void lastEven(List<Integer> numbers, int count) {  //това judge не го проверява само с 1 стойност !!!
        List<Integer> temp = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        int minSize = Math.min(count, temp.size());
        //        Collections.reverse(temp);
        if (count > numbers.size()) {
            System.out.println("Invalid count");
        } else if (temp.isEmpty()) {
            System.out.println("[]");
        } else {
            temp = temp.subList(temp.size() - minSize, temp.size());
            System.out.println(temp);
        }
    }

    private static void firstOdd(List<Integer> numbers, int count) {
        List<Integer> temp = numbers.stream().filter(n -> n % 2 != 0).limit(count).collect(Collectors.toList());
        if (count > numbers.size()) {
            System.out.println("Invalid count");
        } else if (temp.isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.println(temp);
        }
    }

    private static void firstEven(List<Integer> numbers, int count) {
        List<Integer> temp = numbers.stream().filter(n -> n % 2 == 0).limit(count).collect(Collectors.toList());
        if (count > numbers.size()) {
            System.out.println("Invalid count");
        } else if (temp.isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.println(temp);
        }
    }

    private static List<Integer> rotateList(List<Integer> numbers, int index) {
        List<Integer> temp = new ArrayList<>();
        for (int i = index + 1; i < numbers.size(); i++) {
            temp.add(numbers.get(i));
        }
        for (int i = 0; i <= index; i++) {
            temp.add(numbers.get(i));
        }
        return temp;
    }

    private static void printMaxEvenElementIndex(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        if (!evenNumbers.isEmpty()) {
            int maxNumber = Collections.max(evenNumbers);
            int indexOfMaxNumber = numbers.lastIndexOf(maxNumber);
            System.out.println(indexOfMaxNumber);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMaxOddElementIndex(List<Integer> numbers) {
        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        if (!oddNumbers.isEmpty()) {
            int maxNumber = Collections.max(oddNumbers);
            int indexOfMaxNumber = numbers.lastIndexOf(maxNumber);
            System.out.println(indexOfMaxNumber);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMinEvenElementIndex(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        if (!evenNumbers.isEmpty()) {
            int minNumber = Collections.min(evenNumbers);
            int indexOfMaxNumber = numbers.lastIndexOf(minNumber);
            System.out.println(indexOfMaxNumber);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMinOddElementIndex(List<Integer> numbers) {
        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        if (!oddNumbers.isEmpty()) {
            int minNumber = Collections.min(oddNumbers);
            int indexOfMaxNumber = numbers.lastIndexOf(minNumber);
            System.out.println(indexOfMaxNumber);
        } else {
            System.out.println("No matches");
        }
    }

    private static boolean validateIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}
