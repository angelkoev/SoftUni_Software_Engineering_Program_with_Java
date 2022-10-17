package E04_Methods_Lab;

import java.util.Scanner;

public class E11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(num1, operation, num2));
    }
    public static double calculate(int num1, String operation, int num2) {
        double result = 0.0;
        switch (operation) {
            case "/": result = num1 * 1.0 / num2; break;
            case "*": result = num1 * num2; break;
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
        }
        return result;
    }
}
