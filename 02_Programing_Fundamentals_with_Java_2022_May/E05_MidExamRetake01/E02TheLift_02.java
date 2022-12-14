package E05_MidExamRetake01;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2517#1
public class E02TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean emptySpace = false;

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4 && people > 0) {
                int diff = Math.min((4 - lift[i]), people);
                lift[i] += diff;
                people -= diff;
            }
            if (people <= 0) {
                break;
            }
        }

        if (people <= 0) {
            for (int i = 0; i < lift.length; i++) {
                if (lift[i] < 4) {
                    emptySpace = true;
                }
            }
        }

        if (emptySpace) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        } else if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        } else {
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        }


    }
}
