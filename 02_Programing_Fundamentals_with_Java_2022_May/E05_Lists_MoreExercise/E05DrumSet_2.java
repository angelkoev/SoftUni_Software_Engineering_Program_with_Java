package E05_Lists_MoreExercise;

import java.util.ArrayList;  // при този вариант не махам елементи от списука
import java.util.Arrays;     // просто елементите стават отрицателни
import java.util.List;       // и накрая принтирам само положителните стойности от списъка
import java.util.Scanner;    // така избягвам брояча, който следи колко елемента съм махнал
import java.util.stream.Collectors; // за да съм в синхрон с началния списък, когато трябва да set-вам елемент

public class E05DrumSet_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> initialDrumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> drumSet = new ArrayList<>(initialDrumSet);
        // само с = правим рефернция и променяме началния списък !!!
        // а така правим нов списък, който приема началния списък !!!

        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!")) {

            int hitPower = Integer.parseInt(input);

            for (int i = 0; i < drumSet.size(); i++) {
                int currentDrumHealth = drumSet.get(i) - hitPower;
                if (currentDrumHealth > 0) {
                    drumSet.set(i, currentDrumHealth);
                } else {
                    if (initialDrumSet.get(i) * 3 < savings) {
                        drumSet.set(i, initialDrumSet.get(i));
                        savings -= initialDrumSet.get(i) * 3;
                    } else {
                        drumSet.set(i, currentDrumHealth);
                        if (i <= drumSet.size() - 1) {
                        }

                    }
                }

            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < drumSet.size(); i++) {
            if (drumSet.get(i) > 0)
                System.out.print(drumSet.get(i) + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
