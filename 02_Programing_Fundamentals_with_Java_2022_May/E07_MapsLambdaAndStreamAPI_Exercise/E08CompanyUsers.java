package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class E08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> dataBase = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String user = data[1];

            dataBase.putIfAbsent(company, new ArrayList<>());
            if (!dataBase.get(company).contains(user)) {
                dataBase.get(company).add(user);
            }

            input = scanner.nextLine();
        }

        dataBase.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().stream().forEach(userName -> System.out.println("-- " + userName));
        });
    }

}