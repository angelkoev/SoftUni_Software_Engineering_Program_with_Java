package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int tankCapacity = 255;
        int litersInTank = 0;

        for (int i = 0; i < n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (currentLiters <= tankCapacity - litersInTank) {
                litersInTank += currentLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(litersInTank);

    }
}
