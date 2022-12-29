package E05_MidExamRetake03;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#0
public class E01CounterStrike_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                count++;
                energy -= distance;
                if (count % 3 == 0) {
                    energy += count;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", count, energy);
                return;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", count, energy);

    }
}
