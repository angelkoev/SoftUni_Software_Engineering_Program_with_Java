package E10_FinalExamRetake01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_Ignat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //  <composer, <piece, key>>
        Map<String, Map<String, String>> collectionMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\|");
            String piece = line[0];
            String composer = line[1];
            String key = line[2];

            if (!collectionMap.containsKey(composer)) {
                collectionMap.put(composer, new LinkedHashMap<>());
                collectionMap.get(composer).put(piece, key);
            } else {
                if (!collectionMap.get(composer).containsKey(piece)) {
                    collectionMap.get(composer).put(piece, key);
                }
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandLine = command.split("\\|");

            switch (commandLine[0]) {
                case "Add":
                    String pieceToAdd = commandLine[1];
                    String composerToAdd = commandLine[2];
                    String keyToAdd = commandLine[3];
                    if (!collectionMap.containsKey(composerToAdd)) {
                        collectionMap.put(composerToAdd, new LinkedHashMap<>());
                    }
                    if (collectionMap.get(composerToAdd).containsKey(pieceToAdd)) {
                        System.out.printf("%s is already in the collection!%n", pieceToAdd);
                        break;

                    } else {
                        collectionMap.get(composerToAdd).put(pieceToAdd, keyToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n", pieceToAdd, composerToAdd, keyToAdd);
                    }

                    break;

                case "Remove":
                    String pieceToRemove = commandLine[1];
                    boolean isIn = false;

                    for (Map.Entry<String, Map<String, String>> entry : collectionMap.entrySet()) {

                        if (entry.getValue().containsKey(pieceToRemove)) {
                            entry.getValue().remove(pieceToRemove);
                            System.out.printf("Successfully removed %s!%n", pieceToRemove);
                            isIn = true;
                            break;
                        }
                    }
                    if (!isIn) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                        break;
                    }
                    break;

                case "ChangeKey":
                    String pieceToChangeKey = commandLine[1];
                    String changeKey = commandLine[2];
                    boolean isTrue = false;

//                    for (var entry : collectionMap.entrySet()) {
//                        if (entry.getValue().containsKey(pieceToChangeKey)) {
//                            entry.getValue().put(pieceToChangeKey, changeKey);
//                            System.out.printf("Changed the key of %s to %s!%n", pieceToChangeKey, changeKey);
//                            isTrue = true;
//                            break;
//                        }
//                    }
                    ;

                    for (Map.Entry<String, Map<String, String>> entry : collectionMap.entrySet()) {

                        if (entry.getValue().containsKey(pieceToChangeKey)) {
                            entry.getValue().put(pieceToChangeKey, changeKey);
                            System.out.printf("Changed the key of %s to %s!%n", pieceToChangeKey, changeKey);
                            isTrue = true;
                            break;
                        }
                    }
                    if (!isTrue) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToChangeKey);
                        break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, String>> entry : collectionMap.entrySet()) {
            entry.getValue().entrySet().stream()
                    .forEach(e -> System.out.printf("%s -> Composer: %s, Key: %s%n", e.getKey(), entry.getKey(), e.getValue()));
        }
    }
}
//83/100