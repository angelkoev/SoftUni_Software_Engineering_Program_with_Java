package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Integer> dataBase = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            dataBase.putIfAbsent(resource, 0);  // Това замества закоментираните по-надолу 5 реда
            dataBase.put(resource, dataBase.get(resource) + quantity);

//            if (!dataBase.containsKey(resource)) {
//                dataBase.put(resource, quantity);
//            } else {
//                dataBase.put(resource, dataBase.get(resource) + quantity);
//            }
            resource = scanner.nextLine();
        }

        dataBase.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));

    }
}
