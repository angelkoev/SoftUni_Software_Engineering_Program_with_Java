package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E07WaterOverflow_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int litersInTank = 0;

        for (int i = 0; i < n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (currentLiters + litersInTank > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            litersInTank += currentLiters;

    }

        System.out.println(litersInTank);

}
}
