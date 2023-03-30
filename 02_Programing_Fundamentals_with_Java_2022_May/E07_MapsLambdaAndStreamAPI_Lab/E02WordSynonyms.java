package E07_MapsLambdaAndStreamAPI_Lab;

import java.util.*;

public class E02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (words.get(word) == null) {
                words.putIfAbsent(word, new ArrayList<>());
                words.get(word).add(synonym);
            } else {
                words.get(word).add(synonym);
            }

        }
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            int count = 0;
            System.out.print(entry.getKey() + " - ");

            for (String word : entry.getValue()) {

                count++;
                System.out.print(word);
                if (count < entry.getValue().size()) {
                    System.out.print(", ");
                }

            }
            System.out.println();
        }

    }
}
