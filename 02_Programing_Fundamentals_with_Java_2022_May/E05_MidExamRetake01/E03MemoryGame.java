package E05_MidExamRetake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2517#2
public class E03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals("end")) {
            counter++;
            int[] indexesArr = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int index1 = indexesArr[0];
            int index2 = indexesArr[1];

            if (index1 == index2) {
                String itemToAdd = "-" + counter + "a";
                elements.add(elements.size() / 2, itemToAdd);
                elements.add(elements.size() / 2, itemToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
                input = scanner.nextLine();
                continue;
            }
            if (!isValidIndex(elements, index1) || !isValidIndex(elements, index2)) {
                String itemToAdd = "-" + counter + "a";
                elements.add(elements.size() / 2, itemToAdd);
                elements.add(elements.size() / 2, itemToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
                input = scanner.nextLine();
                continue;
            }

            if (elements.get(index1).equals(elements.get(index2))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(index1));
                if (index1 < index2) {
                    elements.remove(index2);
                    elements.remove(index1);
                } else {
                    elements.remove(index1);
                    elements.remove(index2);
                }
            } else {
                System.out.println("Try again!");
            }

            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", counter);
                break;
            }


            input = scanner.nextLine();
        }

        if (!elements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            printList(elements, " ");
        }

    }

    private static boolean isValidIndex(List<String> array, int targetIndex) {
        return targetIndex >= 0 && targetIndex < array.size();
    }

    private static void printList(List<String> array, String separator) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i < array.size() - 1) {
                System.out.printf(separator);
            }
        }
        System.out.println();
    }
}
