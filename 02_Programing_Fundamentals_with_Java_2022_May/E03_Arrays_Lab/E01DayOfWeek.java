package E03_Arrays_Lab;

import java.util.Scanner;

public class E01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = new String[8];

        daysOfWeek[0] = "Invalid day!";
        daysOfWeek[1] = "Monday";
        daysOfWeek[2] = "Tuesday";
        daysOfWeek[3] = "Wednesday";
        daysOfWeek[4] = "Thursday";
        daysOfWeek[5] = "Friday";
        daysOfWeek[6] = "Saturday";
        daysOfWeek[7] = "Sunday";

        if (n > 7 || n <= 0) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(daysOfWeek[n]);
        }

    }
}
