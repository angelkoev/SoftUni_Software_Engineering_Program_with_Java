package E05_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    int numberToContain = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }

                    break;
                case "Print":
                    String oddOrEven = tokens[1];
                    if (oddOrEven.equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (oddOrEven.equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);

                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (tokens[1]) {
                        case "<":
                            int n = Integer.parseInt(tokens[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < n) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            int n1 = Integer.parseInt(tokens[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > n1) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            int n2 = Integer.parseInt(tokens[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= n2) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            int n3 = Integer.parseInt(tokens[2]);
                            for (int i = 0; i < numbers.size(); i++) {
                                int value = Integer.valueOf(numbers.get(i));
                                if (value >= n3) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }


            input = scanner.nextLine();
        }

//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
    }
}
