package E05_MidExamRetake03;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#0
public class E01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int count = 0;

        while (!input.equals("End of battle")) {
            int currentDistance = Integer.parseInt(input);

            if (initialEnergy >= currentDistance) {
                initialEnergy -= currentDistance;
                count++;
                if (count != 0 && count % 3 == 0) {  //тази проверка беше отдефлно (преди това) и първия тест в judge не имнаваше и даваше 85/100
                    initialEnergy += count;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", count, initialEnergy);
                break;
            }


            input = scanner.nextLine();

        }

//        if (input.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d%n", count, initialEnergy);
//        }


    }
}
