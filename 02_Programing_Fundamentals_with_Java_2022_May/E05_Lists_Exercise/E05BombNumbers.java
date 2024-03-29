package E05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
//            int start = bombIndex - power;
//            int end = bombIndex + power;
//            if (start < 0) {
//                start = 0;
//            }
//            if (end >= numbers.size()) {
//                end = numbers.size() - 1;
//            }

            // долните 2 реда заместват горинте 8 реда с проверките !!!
            int start = Math.max(bombIndex - power, 0);
            int end = Math.min(bombIndex + power, numbers.size() - 1);

            for (int i = start; i <= end; i++) {
                numbers.remove(start);  // тук е много важно да е от start,
                // понеже при тирене на елемент от списъка, той си нямаля дължината
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);

    }
}
