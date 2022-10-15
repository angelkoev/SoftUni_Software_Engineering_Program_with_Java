package E04_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number, count)));

    }

    public static double mathPower(double number, int count) {
        double result = 1;
        for (int i = 0; i < count; i++) {
            result *= number;
        }
        return result;
    }
}
