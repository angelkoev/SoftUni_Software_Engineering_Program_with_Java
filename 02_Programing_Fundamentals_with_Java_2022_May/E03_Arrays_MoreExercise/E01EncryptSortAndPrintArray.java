package E03_Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];



        for (int i = 0; i < n; i++) {
            int totalSum = 0;
            String name = scanner.nextLine();
            int currentNum = 0;
            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);
                switch (c) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
//                    case 'y':
//                    case 'Y':
                        currentNum = c * name.length();
                        totalSum += currentNum;
                        break;
                    default:
                        currentNum = c / name.length();
                        totalSum += currentNum;
                        break;
                }
            }
            numbers[i] = totalSum;

        }
        Arrays.sort(numbers);

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
