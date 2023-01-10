package E05_MidExamRetake04;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2031#2
public class E03HeartDelivery_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int startPosition = 0;

        while (!input.equals("Love!")) {
            int jumpSize = Integer.parseInt(input.split(" ")[1]);
            startPosition += jumpSize;
            if (startPosition > houses.length - 1) {
                startPosition = 0;
            }
            if (houses[startPosition] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", startPosition);
            } else {
                houses[startPosition] -= 2;
                if (houses[startPosition] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", startPosition);
                }
            }


            input = scanner.nextLine();
        }

        int count = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] > 0) {
                count++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", startPosition);

        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {

            System.out.printf("Cupid has failed %d places.%n", count);
        }

    }
}
