package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int longestSeqLenght = 1;
        int longestSeqStart = 0;
        int currentSeqlength = 1;
        int currentSeqStart = 0;

        for (int i = 1; i < array.length; i++) { //тук е много хитро как почваме от i = 1
            if (array[i] == array[i - 1]) { // стравняваме текучщата пшзиция i с предната на i - 1
                currentSeqlength++;     // това ни спестява проверката дали сме достугнали края на масива и гърменето,
                                            //когато се питаме да достъпим позиция извън дължината на масива

                if (currentSeqlength > longestSeqLenght) {
                    longestSeqLenght = currentSeqlength;
                    longestSeqStart = currentSeqStart;
                }
            } else {
                currentSeqlength = 1;
                currentSeqStart = i;
            }
        }
        for (int i = longestSeqStart; i < longestSeqStart + longestSeqLenght; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
