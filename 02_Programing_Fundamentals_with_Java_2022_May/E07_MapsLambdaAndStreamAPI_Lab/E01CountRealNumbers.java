package E07_MapsLambdaAndStreamAPI_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> counts = new TreeMap<>();

        for (Double num : nums) {
            Integer currentCount = counts.get(num);
            if (currentCount != null) {
                counts.put(num, currentCount + 1);
            } else {
                counts.put (num, 1);
            }

//            if (!counts.containsKey(num)) {
//                counts.put(num, 1);
//            } else{
//                counts.put(num, counts.get(num) + 1);
//            }
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
