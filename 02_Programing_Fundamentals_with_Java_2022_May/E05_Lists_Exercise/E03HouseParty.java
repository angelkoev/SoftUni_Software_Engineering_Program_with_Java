package E05_Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");
            // може да split-нем по space и да вземем data size
            // защото с .contains няма да работи, ако подаденото име съдържа "not"
            String name = data[0];
            if (!line.contains("is not going!")) {
//            if (data.length == 3) {     // с коментираното тук се избягва до някъде горния случай
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guests.add(name);
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }

        }
        guests.forEach(System.out::println);

    }
}
