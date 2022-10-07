package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean isTop = false;
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {     //тази проверка е важна да е в началото, поенже без нея дава 80/100
                System.out.print(array[i]);   // тук проверяваме дали сме на последното число от масива
                break;                          // и ако сме на последното число, го печатаме и спираме програмата
            }

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
