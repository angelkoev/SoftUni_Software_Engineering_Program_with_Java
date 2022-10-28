package E04_Methods_Exercise;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long factorial1 = calculateFactorial(num1);
        long factorial2 = calculateFactorial(num2);

        double result = factorial1 * 1.0 / factorial2;
        System.out.printf("%.2f", result);


    }
//важно е и метода да е от тип long и навсякъде да има long
    private static long calculateFactorial(int num) {
        long sum = 1;
//        if (num == 0) {   //това май може и да го няма, но е важно да се знае !0 = 1;
//            return sum;
//        }
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
