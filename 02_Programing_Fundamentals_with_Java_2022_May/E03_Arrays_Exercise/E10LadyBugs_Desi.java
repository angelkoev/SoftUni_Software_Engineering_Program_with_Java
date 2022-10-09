package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

// https://www.youtube.com/watch?v=gH7P3RXPTXQ

public class E10LadyBugs_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(e -> Integer.parseInt(e))
                .toArray(); //индексите, на които има калинки

        for (int ladyBugsIndex : ladyBugsIndexes) {
            if (ladyBugsIndex >= 0 && ladyBugsIndex <= field.length - 1) {
                field[ladyBugsIndex] = 1;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            // command "0 right 1".split(" ") -> [".", "right", "1"]
            // 0 -> от кой интекс се маха/излита калинка
            // right -> посока на движение
            // 1 -> с каква дължина се мести калинката
            String[] tokens = command.split(" "); //[".", "right", "1"]
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            //има летене ако: index-а е в масива и на index-а има калинка
            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                // калината излита
                field[index] = 0;
                if (direction.equals("right")) {
                    index += flyLength; //нова позиция
                    // ПРОВЕРКА ДАЛИ КАЦА ИЛИ ОЩЕ ЩЕ ЛЕТИ
                    //проверка дали новата позиция е свободна
                    // и дали е в полеот
                    // ако няма калинка на индекса, тя каца/спира да лети
                    // ако вече има калинка, тогава тя продължава да лети
                    // ако полето е свършило, тя отдлита (изчезва)
                    while (index <= field.length - 1 && field[index] == 1) {
                        //цикъла се прекъсва ако излетим или намерим празно място
                        index += flyLength;
                    }
                    // СПИРАНЕ НА ЛЕТЕНЕ
                    // ако не е излетяла
                    if (index <= field.length - 1) {
                        field[index] = 1;
                    }
                } else if (direction.equals("left")) {
                    index -= flyLength;
                    // спира да лети ако index < 0 или на index-a няма калинка
                    // продължава ако index >= 0 && index-а да има калинка
                    while (index >= 0 && field[index] == 1) {
                        // продължава да лети ако не намери празно място или излети извън полето
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int number : field) {
            System.out.print(number + " ");
        }
    }
}
