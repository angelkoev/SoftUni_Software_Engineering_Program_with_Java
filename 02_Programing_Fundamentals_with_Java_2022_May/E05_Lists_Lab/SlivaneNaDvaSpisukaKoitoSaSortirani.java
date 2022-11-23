package E05_Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SlivaneNaDvaSpisukaKoitoSaSortirani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sortedA = new ArrayList<>(Arrays.asList(10, 6, 3, 2, 1));
        List<Integer> sortedB = new ArrayList<>(Arrays.asList(9, 8, 4, 0));

        int indexA = 0;
        int indexB = 0;

        List<Integer> merged = new ArrayList<>();

        while (indexA < sortedA.size() || indexB < sortedB.size()) {

            if (indexA < sortedA.size() && sortedA.get(indexA) > sortedB.get(indexB)) {
                merged.add(sortedA.get(indexA));
                indexA++;
            } else {
                merged.add(sortedB.get(indexB));
                indexB++;
            }

        }


        for (int number : merged) {
            System.out.print(number + " ");
        }


    }
}
