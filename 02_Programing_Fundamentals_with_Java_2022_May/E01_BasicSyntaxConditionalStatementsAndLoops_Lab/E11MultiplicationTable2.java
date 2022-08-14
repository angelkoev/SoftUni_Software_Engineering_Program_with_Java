package E01_BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class E11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d", number, times, number * times);
        } else {
            for (int i = times; i <=10 ; i++) {
                System.out.printf("%d X %d = %d%n", number, i, number * i);
            }
        }

    }
}