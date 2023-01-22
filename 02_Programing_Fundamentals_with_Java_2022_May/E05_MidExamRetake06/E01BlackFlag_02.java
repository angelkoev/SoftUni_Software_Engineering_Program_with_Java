package E05_MidExamRetake06;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/1773#0
public class E01BlackFlag_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int perDay = Integer.parseInt(scanner.nextLine());
        double expected = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;

        for (int i = 1; i <= days; i++) {
            totalPlunder += perDay;

            if (i % 3 == 0) {
                totalPlunder += perDay * 0.5;
            }

            if (i % 5 == 0) {
                totalPlunder = totalPlunder * 0.7;
            }
        }

        if (totalPlunder >= expected) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (totalPlunder / expected) * 100);
        }

    }
}
