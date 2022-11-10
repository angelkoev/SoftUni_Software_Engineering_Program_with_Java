package E05_Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numListA = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numListB = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeA = numListA.size();
        int sizeB = numListB.size();

        int sizeMin = Math.min(sizeA, sizeB);
        int sizeMax = Math.max(sizeA, sizeB);

//        int indexA = 0;
//        int indexB = 0;

        List<Integer> merged = new ArrayList<>();

        for (int i = 0; i < sizeMin; i++) {
            merged.add(numListA.get(i));
            merged.add(numListB.get(i));
        }

        for (int i = sizeMin; i < sizeMax; i++) {
            if (sizeA > sizeB) {
                merged.add(numListA.get(i));
            } else {

                merged.add(numListB.get(i));
            }
        }


//        while (indexA < numListA.size() - 1|| indexB < numListB.size() - 1) {
//
//            if (indexA <= indexB) {
//                merged.add(numListA.get(indexA));
//                indexA++;
//            } else {
//                merged.add(numListB.get(indexB));
//                indexB++;
//            }
//
//        }


        for (int number : merged) {
            System.out.print(number + " ");
        }


    }
}
