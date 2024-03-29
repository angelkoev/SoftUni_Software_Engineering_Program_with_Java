package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class E09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> users = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Lumpawaroo")) {
            if (line.contains("|")) {
                String[] data = line.split("\\s+\\|\\s+");
                String side = data[0];
                String username = data[1];
                users.putIfAbsent(side, new ArrayList<>());
//                String getUser = users.get(side).stream().filter(user -> user.equals(username)).findFirst().orElse(null);
                boolean noneMatch = users.entrySet()
                        .stream()
                        .noneMatch(entry -> entry.getValue().contains(username));
//                if (getUser == null) {
                if (noneMatch) {
                    users.get(side).add(username);
                }
            } else if (line.contains("->")) {
                String[] data = line.split("\\s+->\\s+");
                String side = data[1];
                String username = data[0];

                users.forEach((k, v) -> v.remove(username));
                users.putIfAbsent(side, new ArrayList<>());
                users.get(side).add(username);
                System.out.printf("%s joins the %s side!%n", username, side);
            }
            line = scanner.nextLine();
        }

        users.forEach((k, v) -> {
            if (v.size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });

    }
}
