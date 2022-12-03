package E05_MidExamPreparation14Feb2022;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2031#2
public class E03HeartDelivery_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        int startIndex = 0;

        String input = scanner.nextLine();

        while (!input.equals("Love!")) {
            int jumpSize = Integer.parseInt(input.split(" ")[1]);

            int currentJump = startIndex + jumpSize;
            if (startIndex + jumpSize > houses.length - 1) {
                currentJump = 0;
                startIndex = 0;
            }
            if (houses[currentJump] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentJump);
                startIndex = currentJump;
            } else {
               if (houses[currentJump] - 2 <= 0) {
                   houses[currentJump] = 0;
                   System.out.printf("Place %d has Valentine's day.%n", currentJump);
                   startIndex = currentJump;
                } else {
                   houses[currentJump] = houses[currentJump] - 2;
                   startIndex = currentJump;
               }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", startIndex);

        int failedPlaces = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] > 0) {
                failedPlaces++;
            }
        }

        if (failedPlaces == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failedPlaces);
        }

        System.out.println();

    }
}
