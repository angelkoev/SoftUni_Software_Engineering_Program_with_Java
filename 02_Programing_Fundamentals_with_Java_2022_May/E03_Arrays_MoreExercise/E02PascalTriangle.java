package E03_Arrays_MoreExercise;

import java.util.Scanner;

public class E02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] lastArray = new int[n];

        for (int i = 0; i < n; i++) {
            int[] currentArray = new int[i + 1];

            currentArray[0] = 1;
            currentArray[i] = 1;

            for (int j = 1; j < i; j++) {
                currentArray[j] = lastArray[j - 1] + lastArray[j];
            }

            lastArray = currentArray;

            for (int j = 0; j < lastArray.length; j++) {
                System.out.print(lastArray[j] + " ");
            }
            System.out.println();
        }

    }
}

