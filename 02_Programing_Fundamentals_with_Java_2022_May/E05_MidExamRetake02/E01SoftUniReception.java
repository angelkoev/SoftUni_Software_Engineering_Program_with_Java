package E05_MidExamRetake02;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2474#0
public class E01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeEff1 = Integer.parseInt(scanner.nextLine());
        int employeeEff2 = Integer.parseInt(scanner.nextLine());
        int employeeEff3 = Integer.parseInt(scanner.nextLine());

        int totalEff = employeeEff1 + employeeEff2 + employeeEff3;

        int studentCount = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while (studentCount > 0) {
            count++;

            if (count % 4 == 0) {
                count++;
            }

            studentCount -= totalEff;
        }

//        while (remainingStundents > 0) {
//            hoursPassed++;
//            if (hoursPassed % 4 != 0) {
//                remainingStundents -= studentsForHour;
//            }
//
//        }

        System.out.printf("Time needed: %dh.%n", count);
    }
}
