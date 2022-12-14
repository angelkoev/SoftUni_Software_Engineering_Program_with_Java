package E05_MidExamRetake01;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2517#1
public class E02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeople = Integer.parseInt(scanner.nextLine());

        int[] liftPlaces = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean isEmptySpace = false;

//        while (totalPeople > 0) {
            for (int i = 0; i < liftPlaces.length; i++) {
                if (liftPlaces[i] < 4) {
                    if (totalPeople + liftPlaces[i] >= 4) {
                        int currentAddPeople = 4 - liftPlaces[i];
                        liftPlaces[i] += currentAddPeople;
                        totalPeople -= currentAddPeople;
                    } else {
                        int currentAddPeople = totalPeople;
                        liftPlaces[i] += currentAddPeople;
                        totalPeople -= currentAddPeople;
                    }
                }
            }
//            break;
//        }
        if (totalPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", totalPeople);
            for (int i = 0; i < liftPlaces.length; i++) {
                System.out.print(liftPlaces[i] + " ");
            }
        }
        for (int i = 0; i < liftPlaces.length; i++) {
            if (liftPlaces[i] < 4)
                isEmptySpace = true;
        }

        if (isEmptySpace) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < liftPlaces.length; i++) {
                System.out.print(liftPlaces[i] + " ");
            }
        }
        if (!isEmptySpace && totalPeople == 0) {
            for (int i = 0; i < liftPlaces.length; i++) {
                System.out.print(liftPlaces[i] + " ");
            }
        }

    }
}
