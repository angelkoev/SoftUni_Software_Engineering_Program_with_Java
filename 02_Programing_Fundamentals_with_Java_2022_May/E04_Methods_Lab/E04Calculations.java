package E04_Methods_Lab;

import java.util.Scanner;

public class E04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        if (operation.equals("add")) {
            add(a, b);
        } else if (operation.equals("multiply")) {
            multiply(a, b);
        } else if (operation.equals("substract")) {
            substract(a, b);
        } else if (operation.equals("divide")) {
            divide(a, b);
        }


    }

    public static void divide(double a, double b) {
        System.out.printf("%.0f", a / b);
    }

    public static void substract(double a, double b) {
        System.out.printf("%.0f", a - b);
    }

    public static void multiply(double a, double b) {
        System.out.printf("%.0f", a * b);
    }

    public static void add(double a, double b) {
        System.out.printf("%.0f", a + b);
    }
}