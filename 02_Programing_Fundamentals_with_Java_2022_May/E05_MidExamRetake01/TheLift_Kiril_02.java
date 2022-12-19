package E05_MidExamRetake01;

import java.util.Arrays;
        import java.util.Scanner;

public class TheLift_Kiril_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        if(numberOfPeople == 0){
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
            return;
        }
        int busyPlaces = 0;
        for (int i = 0; i < wagons.length; i++) {
            busyPlaces += wagons[i];
        }
        int liftCapacity = wagons.length * 4;
        for (int i = 0; i < wagons.length; i++) {
            if(numberOfPeople == 0){
                break;
            }
            if (wagons[i] < 4) {
                int currentPeopleOnWagon = wagons[i];
                int peopleWhoCanJump = 4 - currentPeopleOnWagon;
                if (numberOfPeople < peopleWhoCanJump) {
                    wagons[i] = wagons[i] + numberOfPeople;
                    numberOfPeople -= numberOfPeople;
                } else {
                    wagons[i] = currentPeopleOnWagon + peopleWhoCanJump;
                    numberOfPeople -= peopleWhoCanJump;
                    busyPlaces += peopleWhoCanJump;
                }

            }
        }
        if (numberOfPeople > 0 ) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numberOfPeople);
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
        } else if (numberOfPeople == 0 && liftCapacity > busyPlaces) {
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
        } else if (numberOfPeople == 0 && liftCapacity == busyPlaces){
            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]",
                    ""));
        }
    }
}
