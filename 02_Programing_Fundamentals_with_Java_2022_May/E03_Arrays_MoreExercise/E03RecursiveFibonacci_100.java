package E03_Arrays_MoreExercise;

import java.util.Scanner;

// https://softuni.bg/forum/29993/03-recursive-fibonacci-csharp-fundamentals

// dava 100/100, защото добавих и за N = 0, макар че в условието пише 1 ≤ N ≤ 50
// https://judge.softuni.org/Contests/Practice/Index/1279#2

public class E03RecursiveFibonacci_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long[] fibonacciSequence = new long[51];

        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        fibonacciSequence[2] = 1;

//        if (n > 2) {
        for (int i = 3; i < n+1; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
//        }
        System.out.println(fibonacciSequence[n]);

    }
}
