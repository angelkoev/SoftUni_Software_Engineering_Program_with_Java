package E01_BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class E04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int backAfterMinutes = 30;

        int totalMinutes = hours * 60 + minutes + backAfterMinutes;

        int finalHour = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHour > 23) {
            finalHour = 0;
        }

        System.out.printf("%d:%02d", finalHour, finalMinutes);

    }
}
