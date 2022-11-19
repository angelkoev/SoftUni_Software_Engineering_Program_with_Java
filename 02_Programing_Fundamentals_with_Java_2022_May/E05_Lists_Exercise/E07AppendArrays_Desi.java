package E05_Lists_Exercise;

import java.util.Scanner;

public class E07AppendArrays_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrays = input.split("\\|");
        for (int i = arrays.length - 1; i >= 0; i--) {
            String elements = arrays[i].trim(); // trim маха излишните интервали в началото и в края

            if (elements.equals(" ") || elements.equals("")) {
                continue;     // проверява дали имаме празен елемент и ако нямаме, не го обработваме
                            // това ин реши пробема с единия тест, на който даваше грешка
            }

            String[] numbers = elements.split("\\s+");
            for (String number : numbers) {
                System.out.print(number + " ");
            }
        }

    }
}
