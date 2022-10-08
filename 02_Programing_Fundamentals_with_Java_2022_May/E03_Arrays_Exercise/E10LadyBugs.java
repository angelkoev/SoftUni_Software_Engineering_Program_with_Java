package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] bugPositions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[fieldSize];

        for (int i = 0; i < bugPositions.length; i++) {
            int index = bugPositions[i];
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }
        }
//        for (int bugPosition : bugPositions) {     // това прави същото като горнотоо
//            field[bugPosition] = 1;                // вкарва i по посочените позиции
//        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] data = input.split("\\s+");
            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if (index < 0 || index >= field.length || field[index] != 1) {  //реда на проверките е от значение !!!
                input = scanner.nextLine();
                continue;
            }

            field[index] = 0;
            if (direction.equals("right")) {
                index += flyLength;
                while (index < fieldSize && field[index] == 1) {   //реда на проверките е от значение !!!
                    index += flyLength;
                }
                if (index < fieldSize) { //проверяваме дали калинката е излетяла извън полето
                    // преди това на горното имахме грешка, защото сравнявахме с flyLength, което е съвсем друго
                    field[index] = 1;  // ако е в полето, каца на index-a
                }
            } else {
                index -= flyLength;
                while (index >= 0 && field[index] == 1) {   //реда на проверките е от значение !!!
                    index -= flyLength;
                }
                if (index >= 0) { //проверяваме дали калинката е излетяла извън полето
                    field[index] = 1;  // ако е в полето, каца на index-a
                }
            }


            input = scanner.nextLine();
        }

        Arrays.stream(field).forEach(e -> System.out.print(e + " "));

    }
}
