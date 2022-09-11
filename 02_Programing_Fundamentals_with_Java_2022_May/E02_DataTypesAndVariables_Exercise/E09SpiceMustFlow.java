package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpice = 0;

        while (startingYield >= 100) {
            totalSpice += startingYield;
            totalSpice -= 26;
            startingYield -= 10;
            days++;
        }


        totalSpice -= 26;
        if (totalSpice < 0) {
            totalSpice = 0;
        }
        System.out.println((days));
        System.out.println(totalSpice);

    }
}
