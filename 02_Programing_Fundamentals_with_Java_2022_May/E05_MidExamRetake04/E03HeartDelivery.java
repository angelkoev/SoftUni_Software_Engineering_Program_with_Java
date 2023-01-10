package E05_MidExamRetake04;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2031#2
public class E03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        int initialPosition = 0;

        String input = scanner.nextLine();

        while (!input.equals("Love!")) {

            String[] command = input.split("\\s+");
            int length = Integer.parseInt(command[1]);

            initialPosition += length;
            if (initialPosition > houses.length - 1) {
                initialPosition = 0;
            }

            if (houses[initialPosition] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", initialPosition);
            } else {
                houses[initialPosition] -= 2;
                if (houses[initialPosition] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", initialPosition);
                }
            }

            input = scanner.nextLine();
        }


        System.out.printf("Cupid's last position was %d.%n", initialPosition);
        int count = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] > 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.printf("Cupid has failed %d places.", count);
        } else {
            System.out.printf("Mission was successful.");
        }


    }
}
