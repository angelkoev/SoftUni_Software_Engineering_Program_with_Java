package E05_Lists_MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class E04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> input2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int smallerLenght = Math.min(input1.size(), input2.size());
        int difference = Math.max(input1.size(), input2.size()) - Math.min(input1.size(), input2.size());

        List<Integer> bothInputs = new ArrayList<>();

        for (int i = 0; i < smallerLenght; i++) {
            bothInputs.add(input1.get(0));
            bothInputs.add(input2.get(input2.size() - 1));
            input1.remove(0);
            input2.remove(input2.size() - 1);
        }

        Collections.sort(bothInputs);

        int minNumber = 0;
        int maxNumber = 0;

        if (input1.size() > 1) {
            minNumber = Math.min(input1.get(0), input1.get(1));
            maxNumber = Math.max(input1.get(0), input1.get(1));
        } else {
            minNumber = Math.min(input2.get(0), input2.get(1));
            maxNumber = Math.max(input2.get(0), input2.get(1));
        }

        for (int i = 0; i < bothInputs.size(); i++) {
            if (minNumber < bothInputs.get(i) && bothInputs.get(i) < maxNumber) {
                System.out.print(bothInputs.get(i) + " ");
            }
        }

        System.out.println();


    }
}
