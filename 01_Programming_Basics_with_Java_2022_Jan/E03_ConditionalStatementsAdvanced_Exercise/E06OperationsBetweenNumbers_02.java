import java.util.Scanner;

public class E06OperationsBetweenNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        String operator = scanner.nextLine();

        double result = 0;
        String evenOrOdd = "";

        if (operator.equals("+")) {
            result = numOne + numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
        } else if (operator.equals("-")) {
            result = numOne - numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
        } else if (operator.equals("*")) {
            result = numOne * numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
        } else if (operator.equals("/")) {
            result = 1.0 * numOne / numTwo;
        } else if (operator.equals("%") && numTwo != 0) {
            result = numOne % numTwo;
        } else if (operator.equals("%") && numTwo == 0) {
            System.out.printf("Cannot divide %d by zero", numOne);
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", numOne, operator, numTwo, result, evenOrOdd);
        } else if (operator.equals("/") && numTwo == 0) {
            System.out.printf("Cannot divide %d by zero", numOne);
        } else if (operator.equals("/") && numTwo != 0) {
            System.out.printf("%d %s %d = %.2f", numOne, operator, numTwo, result);
        } else if (operator.equals("%") && numTwo != 0) {
            System.out.printf("%d %s %d = %.0f", numOne, operator, numTwo, result);
        }
    }
}