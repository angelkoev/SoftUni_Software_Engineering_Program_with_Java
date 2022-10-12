package E04_Methods_Lab;

import java.util.Scanner;

public class E03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int lenght = 1; lenght <= number; lenght++) {
            printIngreasingNumbers(lenght);
        }

        for (int lenght = number - 1; lenght > 0; lenght--) {
            printIngreasingNumbers(lenght);
        }

    }

    private static void printIngreasingNumbers(int lenght) {
        for (int i = 1; i <= lenght; i++) {
            System.out.print(i);
            if (i < lenght) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
