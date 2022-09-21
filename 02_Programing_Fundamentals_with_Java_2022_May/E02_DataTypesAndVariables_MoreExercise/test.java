package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String test = scanner.nextLine();

        while (!test.equals("stop")) {

            int number = Integer.parseInt(test);

            if (number % 1 == 0) {
                System.out.println("case 1");
            } else {
                System.out.println("case 2");
            }

            test = scanner.nextLine();
        }

    }
}
