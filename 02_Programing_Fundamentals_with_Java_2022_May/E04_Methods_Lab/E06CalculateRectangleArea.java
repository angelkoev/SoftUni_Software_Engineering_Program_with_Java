package E04_Methods_Lab;

import java.util.Scanner;

public class E06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", getArea(a, b));

    }

    public static double getArea(double a, double b) {
        return a * b;
    }
}
