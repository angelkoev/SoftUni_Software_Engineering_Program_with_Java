package E04_Methods_Lab;

import java.util.Scanner;

public class E01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int number = Integer.parseInt(scanner.nextLine());
//        printSigh(number);

        printSigh(Integer.parseInt(scanner.nextLine()));

    }

    private static void printSigh(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
    }
}
