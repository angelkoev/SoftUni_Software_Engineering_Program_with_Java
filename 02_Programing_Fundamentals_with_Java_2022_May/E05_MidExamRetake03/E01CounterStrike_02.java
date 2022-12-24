package E05_MidExamRetake03;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2305#0
public class E01CounterStrike_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        int count = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                energy -= distance;
                count++;
                if (count % 3 == 0) {
                    energy += count;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, energy);
                return;
            }

            input = scanner.nextLine();
        }

//        if (input.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", count, energy);
//        }
    }
}
