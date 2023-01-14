package E05_MidExamRetake05;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2028#0
public class E01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0; // ако е Double.MIN_VALUE единия тест не имнаваше !!!
        int attendedLecturesForMaxBonus = 0;

        for (int i = 0; i < students; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double bonus = attendances * 1.0 / lectures * (5 + additionalBonus);
            if (bonus > maxBonus) {
                maxBonus = bonus;
                attendedLecturesForMaxBonus = attendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", attendedLecturesForMaxBonus);

    }
}
