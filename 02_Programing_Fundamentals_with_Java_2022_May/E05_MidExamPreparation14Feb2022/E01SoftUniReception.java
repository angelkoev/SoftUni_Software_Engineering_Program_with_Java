package E05_MidExamPreparation14Feb2022;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2474#0
public class E01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeFirst = Integer.parseInt(scanner.nextLine());
        int employeeSecond = Integer.parseInt(scanner.nextLine());
        int employeeThirhd = Integer.parseInt(scanner.nextLine());

        int studentsForHour = employeeFirst + employeeSecond + employeeThirhd;

        int remainingStundents = Integer.parseInt(scanner.nextLine());

        int hoursPassed = 0;

        while (remainingStundents > 0) {
            hoursPassed++;
            if (hoursPassed % 4 != 0) {
                remainingStundents -= studentsForHour;
            }
        }

        System.out.printf("Time needed: %dh.", hoursPassed);
    }
}
