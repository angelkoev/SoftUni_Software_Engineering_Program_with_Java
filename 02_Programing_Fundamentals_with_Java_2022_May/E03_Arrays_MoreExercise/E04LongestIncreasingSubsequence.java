package E03_Arrays_MoreExercise;

import java.util.Arrays;  // Dynamic programing
import java.util.Scanner; // Динамично оптимиране
// https://www.youtube.com/watch?v=0mj60_DP1jI

public class E04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] lisLengths = new int[numbers.length];
        int[] lisPrev = new int[numbers.length];
        for (int i = 0; i < lisLengths.length; i++) {
            lisLengths[i] = 1;
            lisPrev[i] = -1;
        }               // за същото може да използваме и Arrays.fill(lisLengths, 1);

        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {
            for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {
                if (numbers[prevIndex] < numbers[currentIndex]) {
                    int candidateLength = lisLengths[prevIndex] + 1;
                    if (candidateLength > lisLengths[currentIndex]) {
                        lisLengths[currentIndex] = candidateLength;
                        lisPrev[currentIndex] = prevIndex;
                    }
                }
            }
        }

//        for (int lisLength : lisLengths) {
//            System.out.print(lisLength + " ");
//        }
//        System.out.println();

        int maxLength = 0;
        int maxLengthIndex = -1;
        for (int i = 0; i < lisLengths.length; i++) {
            if (lisLengths[i] > maxLength) {
                maxLength = lisLengths[i];
                maxLengthIndex = i;
            }
        }

//        System.out.println(maxLength);

        int index = maxLengthIndex;
        int[] lis = new int[maxLength];
        int pos = 0;

        while (index != -1) {
            lis[pos] = numbers[index];
            pos++;
            index = lisPrev[index];
        }

        Arrays.sort(lis);

        for (int i = 0; i < lis.length; i++) {
            System.out.print(lis[i] + " ");
        }

    }
}

