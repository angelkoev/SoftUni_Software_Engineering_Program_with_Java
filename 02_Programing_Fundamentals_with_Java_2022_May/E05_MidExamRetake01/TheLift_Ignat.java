package E05_MidExamRetake01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLift_Ignat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int waitingPeople = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");
        List<Integer> wagons = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            wagons.add(number);
        }

        int busyPlaces = 0;
        for (Integer wagon : wagons) {
            busyPlaces += wagon;
        }

        int freePlaces = wagons.size() * 4 - busyPlaces;

        for (int i = 0; i < wagons.size(); i++) {
            int currentWagon = wagons.get(i);
            while (currentWagon < 4) {
                if (waitingPeople > 0) {
                    currentWagon++;
                    waitingPeople--;
                    freePlaces--;
                } else {
                    break;
                }
            }
            wagons.set(i, currentWagon);
        }
        if (waitingPeople == 0 && freePlaces > 0) {

            System.out.println("The lift has empty spots!");
            for (Integer wagon : wagons) {
                System.out.print(wagon + " ");
            }

        } else if (waitingPeople > 0 && freePlaces == 0) {

            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            for (Integer wagon : wagons) {
                System.out.print(wagon + " ");
            }

        } else if (waitingPeople == 0 && freePlaces == 0) {

            for (Integer wagon : wagons) {
                System.out.print(wagon + " ");
            }
        }
    }
}
