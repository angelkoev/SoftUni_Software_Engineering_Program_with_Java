package E05_Lists_MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> initialDrumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> drumSet = new ArrayList<>(initialDrumSet);
        // само с = правим рефернция и променяме началния списък !!!
        // а така правим нов списък, който приема началния списък !!!

        String input = scanner.nextLine();

        int removedElementsCount = 0;

        while (!input.equals("Hit it again, Gabsy!")) {

            int hitPower = Integer.parseInt(input);

            for (int i = 0; i < drumSet.size(); i++) {
                int currentDrumHealth = drumSet.get(i) - hitPower;
                if (currentDrumHealth > 0) {
                    drumSet.set(i, currentDrumHealth);
                } else {
                    if (initialDrumSet.get(i+removedElementsCount) * 3 < savings) {  // на едно място бях забравил
                        drumSet.set(i, initialDrumSet.get(i+removedElementsCount)); // да добавям removedElementCount
                        savings -= initialDrumSet.get(i+removedElementsCount) * 3; // друг вариант май е
                    } else {          // да се записва отрицателна стойност и да не се трие индекса
                        drumSet.remove(i);  // така накрая трябва да се отпечатат само положителните стойности
                        if (i <= drumSet.size() - 1) { // ще трябва и проверка ако началния индекс е отрицателе, да го пропусне
                            i--;                       // така я реших след това !!!
                            removedElementsCount++;
                        }

                    }
                }

            }


            input = scanner.nextLine();
        }

        for (Integer state : drumSet) {
            System.out.print(state + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
