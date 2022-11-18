package E05_Lists_Exercise;

import java.util.Scanner;

public class E07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split("\\|");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i].trim() + " "; // после добавих trim(), за да махна излишните интервали
        }
        String[] finalResult = result.split("\\s+");

        for (String s : finalResult) {
            System.out.print(s + " ");
        }

    }

}
