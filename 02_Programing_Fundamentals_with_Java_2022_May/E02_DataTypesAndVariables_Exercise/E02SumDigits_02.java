package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E02SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number !=0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
