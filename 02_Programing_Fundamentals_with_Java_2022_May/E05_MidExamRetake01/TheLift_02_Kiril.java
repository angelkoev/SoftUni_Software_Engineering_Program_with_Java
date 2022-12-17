package E05_MidExamRetake01;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02_Kiril {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < wagons.length; i++) {
            if (wagons[i] < 4 && numberOfPeople >= 0) {
                if (numberOfPeople + wagons[i] >= 4) {
                    int peopleWhoCanJump = 4 - wagons[i];
                    wagons[i] += peopleWhoCanJump;
                    numberOfPeople -= peopleWhoCanJump;
                } else {
                    int peopleWhoCanJump = numberOfPeople;
                    wagons[i] += peopleWhoCanJump;
                    numberOfPeople -= 5;
                }
            }
        }

        if (numberOfPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numberOfPeople);
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
        } else if (numberOfPeople < 0) {
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
        } else {
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
        }
    }
}
