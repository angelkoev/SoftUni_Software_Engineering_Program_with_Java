package E05_MidExamPreparation24Oct2021;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2028#0
public class E01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int initBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0.0;
        int maxAttendances = 0;

        for (int i = 0; i < countStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double currentBonus = attendances * 1.0 / countLectures * ( 5 + initBonus);

            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                maxAttendances = attendances;
            }
        }

//        int roundedMaxBonus = (int) Math.ceil(maxBonus);
//        System.out.printf("Max Bonus: %d.%n", roundedMaxBonus);
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendances);



    }
}
