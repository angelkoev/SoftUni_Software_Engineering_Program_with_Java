package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] array1 = new String[n];
        String [] array2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            if (i % 2 == 0) {
                array1[i] = line[0];
                array2[i] = line[1];
            } else {
                array1[i] = line[1];
                array2[i] = line[0];
            }

        }

        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));

//        for (int i = 0; i < n; i++) {
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(array2[i] + " ");
//        }

    }
}
