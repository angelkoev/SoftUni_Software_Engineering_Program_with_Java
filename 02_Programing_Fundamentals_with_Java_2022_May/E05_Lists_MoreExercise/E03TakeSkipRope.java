package E05_Lists_MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class E03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        List<String> nonNumbers = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        String result = "";

        for (int i = 0; i < input.size(); i++) {
            String currentString = input.get(i);
            char currentChar = currentString.charAt(0);
            if (Character.isDigit(currentChar)) {
                numbers.add(Integer.parseInt(currentString));
            } else {
                nonNumbers.add(currentString);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }
        for (int i = 0; i < takeList.size(); i++) {
            result += take(nonNumbers, takeList.get(i));
            skip(nonNumbers, skipList.get(i));
        }

        System.out.println(result);

    }

    public static String take(List<String> list, int times) {
        String takedString = "";
        if (times > list.size()) {
            times = list.size();
        }
        for (int i = 0; i < times; i++) {
            takedString += list.get(0);
            list.remove(0);
        }
        return takedString;
    }
    public static void skip(List<String> list, int times) {
        if (times > list.size()) {
            times = list.size();
        }
        for (int i = 0; i < times; i++) {
            list.remove(0);
        }
    }
}

