package E05_MidExamPreparation14Feb2022;

import java.util.Scanner;

public class E01SoftUniReception_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int totalStudents = Integer.parseInt(scanner.nextLine());

        int workingCapacity = n1 + n2 + n3;

        int hoursNeeded = 0;

        while (totalStudents > 0) {
            hoursNeeded++;
            if (hoursNeeded % 4 != 0) {
                totalStudents -= workingCapacity;
            } else {
                continue;
            }

        }

        System.out.printf("Time needed: %dh.%n", hoursNeeded);

    }
}
