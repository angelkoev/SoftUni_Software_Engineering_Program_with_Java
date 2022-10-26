package E04_Methods_Exercise;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int result = substract(sum(num1, num2), num3);
        System.out.println(result);


    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static int substract(int sum, int num3) {
        return sum - num3;
    }
}
