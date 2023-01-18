package E05_MidExamRetake05;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2028#0
public class E01BonusScoringSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int addBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendances = 0;

        for (int i = 0; i < numberOfStudents; i++) {

            int attendances = Integer.parseInt(scanner.nextLine());

            double currentStudentBonus = attendances * 1.0 / lectures * (5 + addBonus);

            if (currentStudentBonus >= maxBonus) {
                maxBonus = currentStudentBonus;
                maxAttendances = attendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendances);

    }
}
