package E05_MidExamPreparation24Oct2021;

import java.util.Scanner;

public class E01BonusScoringSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfTheStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonusPoints = 0;
        int maxAttendances = 0;

        for (int i = 0; i < countOfTheStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double totalBonus = attendances * 1.0 / countOfLectures * (5 + additionalBonus);

            if (totalBonus > maxBonusPoints) {
                maxBonusPoints = totalBonus;
                maxAttendances = attendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonusPoints));
        System.out.printf("The student has attended %d lectures.%n", maxAttendances);


        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})

    }
}
