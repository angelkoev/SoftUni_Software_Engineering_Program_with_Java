package E04_Methods_MoreExercise;

import java.util.Scanner;

public class E04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        tribonachiMethod(n);
        long[] tribonacciSequence = new long[50];

        tribonacciSequence[0] = 1;
        tribonacciSequence[1] = 1;
        tribonacciSequence[2] = 2;

        for (int i = 3; i < n; i++) {
            tribonacciSequence[i] = tribonacciSequence[i - 1] + tribonacciSequence[i - 2] + tribonacciSequence[i - 3];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(tribonacciSequence[i] + " ");

        }

    }

    private static void tribonachiMethod(int n) {
    }
}
