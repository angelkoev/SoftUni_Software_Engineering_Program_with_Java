package E05_MidExamRetake02;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2474#0
public class E01SoftUniReception_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int totalWorkForce = num1 + num2 + num3;

        int students = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while (students > 0) {
            count++;

            if (count % 4 != 0) {
                students = students - totalWorkForce;
            }

        }

        System.out.printf("Time needed: %dh.", count);

    }
}
