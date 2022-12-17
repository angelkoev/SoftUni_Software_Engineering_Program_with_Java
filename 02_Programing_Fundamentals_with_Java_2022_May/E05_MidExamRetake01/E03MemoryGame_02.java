package E05_MidExamRetake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2517#2
public class E03MemoryGame_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        int moves = 0;

        while (!input.equals("end")) {
            moves++;
            int index1 = Integer.parseInt(input.split(" ")[0]);
            int index2 = Integer.parseInt(input.split(" ")[1]);

            if (index1 == index2) {  // тази проверка я правих по-надолу... а преди това беше общя с другата и не минаваше 1 тест
                System.out.println("Invalid input! Adding additional elements to the board");
                numbers.add(numbers.size()/2, "-" + moves + "a");
                numbers.add(numbers.size()/2, "-" + moves + "a");
                input = scanner.nextLine();
                continue;
            }
            if (isIndexValid(index1, index2, numbers)) {
                String element1 = numbers.get(index1);
                String element2 = numbers.get(index2);
                if (element1.equals(element2) ) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                    numbers.remove(element1);
                    numbers.remove(element2);
                } else {
                    System.out.println("Try again!");
                }
            } else {
                System.out.println("Invalid input! Adding additional elements to the board");
                numbers.add(numbers.size()/2, "-" + moves + "a");
                numbers.add(numbers.size()/2, "-" + moves + "a");
            }



            if (numbers.isEmpty()) {
                System.out.printf("You have won in %d turns!", moves);
                return;
            }

            input = scanner.nextLine();
        }

        if (!numbers.isEmpty()) {
            System.out.println("Sorry you lose :(");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }

    }

    public static boolean isIndexValid(int index1, int index2, List<String> numbers) {
        return index1 >= 0 && index2 >= 0 && index1 < numbers.size() && index2 < numbers.size();
    }
}
