package E01_BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class E02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}
