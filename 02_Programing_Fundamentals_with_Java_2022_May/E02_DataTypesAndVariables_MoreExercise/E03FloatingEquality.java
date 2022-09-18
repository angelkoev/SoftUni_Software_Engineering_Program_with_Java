package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double diff = Math.abs(num1 - num2);

        if (diff < 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
