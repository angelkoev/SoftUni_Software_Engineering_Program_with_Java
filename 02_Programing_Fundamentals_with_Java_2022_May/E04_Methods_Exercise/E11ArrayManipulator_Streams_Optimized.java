package E04_Methods_Exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E11ArrayManipulator_Streams_Optimized {
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
                case "min":
                    maxOrMin(numbers, type, tokens[1]);
                    break;
                case "first":
                case "last":
                    int count = Integer.parseInt(tokens[1]);
                    firstOrLast(numbers, count, type, tokens[2]);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers);
    }

    private static void firstOrLast(List<Integer> numbers, int count, String firstOrLast, String evenOrOdd) {
        List<Integer> temp = new ArrayList<>();
        if (evenOrOdd.equals("even")) {
            if (firstOrLast.equals("last")) {
                temp = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            } else if (firstOrLast.equals("first")) {
                temp = numbers.stream().filter(n -> n % 2 == 0).limit(count).collect(Collectors.toList());
            }
        } else if (evenOrOdd.equals("odd")) {
            if (firstOrLast.equals("last")) {
                temp = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
            } else if (firstOrLast.equals("first")) {
                temp = numbers.stream().filter(n -> n % 2 != 0).limit(count).collect(Collectors.toList());
            }
        }
        int minSize = Math.min(count, temp.size());
        if (count > numbers.size()) {
            System.out.println("Invalid count");
        } else if (temp.isEmpty()) {
            System.out.println("[]");
        } else if (firstOrLast.equals("first")) {
            System.out.println(temp);
        } else if (firstOrLast.equals("last")) {
            temp = temp.subList(temp.size() - minSize, temp.size());
            System.out.println(temp);
        }
    }

    private static List<Integer> rotateList(List<Integer> numbers, int index) {
        List<Integer> temp1 = numbers.subList(index + 1, numbers.size());
        List<Integer> temp2 = numbers.subList(0, index + 1);
        return Stream.concat(temp1.stream(), temp2.stream())
                .collect(Collectors.toList());
    }
//        List<Integer> temp = new ArrayList<>();
//        for (int i = index + 1; i < numbers.size(); i++) {
//            temp.add(numbers.get(i));
//        }
//        for (int i = 0; i <= index; i++) {
//            temp.add(numbers.get(i));
//        }
//        return temp;
//    }

    private static void maxOrMin(List<Integer> numbers, String maxOrMin, String evenOrOdd) {
        List<Integer> temp = new ArrayList<>();
        if (evenOrOdd.equals("even")) {
            temp = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        } else if (evenOrOdd.equals("odd")) {
            temp = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        }
        if (maxOrMin.equals("max")) {
            if (!temp.isEmpty()) {
                int maxNumber = Collections.max(temp);
                int indexOfMaxNumber = numbers.lastIndexOf(maxNumber);
                System.out.println(indexOfMaxNumber);
            } else {
                System.out.println("No matches");
            }
        } else if (maxOrMin.equals("min")) {
            if (!temp.isEmpty()) {
                int minNumber = Collections.min(temp);
                int indexOfMaxNumber = numbers.lastIndexOf(minNumber);
                System.out.println(indexOfMaxNumber);
            } else {
                System.out.println("No matches");
            }
        }
    }

    private static boolean validateIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}

