package E03_Arrays_Lab;

import java.util.Scanner;

public class E06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String[] firstStrings = first.split(" ");
        int[] firstNumbers = new int[firstStrings.length];
        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = Integer.parseInt(firstStrings[i]);
        }

        String[] secondStrings = second.split(" ");
        int[] secondNumbers = new int[secondStrings.length];
        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = Integer.parseInt(secondStrings[i]);
        }

        // == byte, short, int, long, float, double, char
        // когато имаме "new", с == се сравняват адресите в паметта !!!

        boolean arraysAreEquals;
        int sum = 0;
        int differenceIndex = 0;

        if (firstNumbers.length != secondNumbers.length) {
            arraysAreEquals = false;
        } else {
            arraysAreEquals = true;
            for (int i = 0; i < firstNumbers.length; i++) {
                sum += firstNumbers[i];
                if (firstNumbers[i] != secondNumbers[i]) {
                    arraysAreEquals = false;
                    differenceIndex = i;
                    break;
                }
            }
        }
        if (arraysAreEquals) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differenceIndex);
        }

    }
}
