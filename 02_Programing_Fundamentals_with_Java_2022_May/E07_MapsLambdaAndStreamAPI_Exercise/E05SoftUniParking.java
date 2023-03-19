package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> dataBase = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String command = data[0];
            String username = data[1];
            String licensePLateNumber = "";
            if (command.equals("register")) {
                licensePLateNumber = data[2];
            }


            if (command.equals("register")) {
                if (dataBase.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", dataBase.get(username));
                } else {
                    dataBase.put(username, licensePLateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePLateNumber);
                }
            } else if (command.equals("unregister")) {
                if (!dataBase.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    dataBase.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
//            dataBase.putIfAbsent(username, licensePLateNumber);
            }
        }
        dataBase.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));

    }
}
