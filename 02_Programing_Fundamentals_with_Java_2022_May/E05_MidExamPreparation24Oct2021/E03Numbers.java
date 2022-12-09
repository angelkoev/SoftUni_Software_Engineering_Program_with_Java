package E05_MidExamPreparation24Oct2021;

import java.sql.SQLOutput;
import java.util.*;

// https://judge.softuni.org/Contests/Practice/Index/2474#2
public class E03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        double sum = 0.0;

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            sum += currentNum;
        }

        double average = sum / numbersArr.length;

        List<Integer> topNumbers = new ArrayList<>();

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            if (currentNum > average) {
                topNumbers.add(currentNum);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        } else if (topNumbers.isEmpty()) {  //стажа и с if (topNumbers.size() == 0)
            System.out.println("No");
        }        else {
            System.out.println(topNumbers.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
