package E10_FinalExamRetake01;

import java.util.*;

// TODO -> преправих я по решение на Деси !!!
// TODO -> тези Мап-ове още не съм ги усвоил добре !!!

public class E03ThePianist_withMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("[|]");
            String pieceName = data[0];
            String composer = data[1];
            String key = data[2];
            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            piecesMap.put(pieceName, pieceInfo);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String data[] = input.split("[|]");
            String action = data[0];
            String pieceName = data[1];
            switch (action) {
                case "Add":
                    String composer = data[2];
                    String key = data[3];
                    add(piecesMap, pieceName, composer, key);
                    break;
                case "Remove":
                    remove(piecesMap, pieceName);
                    break;
                case "ChangeKey":
                    String newKey = data[2];
                    change(piecesMap, pieceName, newKey);
                    break;
            }


            input = scanner.nextLine();
        }


        piecesMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        }

    private static void add(Map<String, List<String>> piecesMap, String pieceName, String composer, String key) {
        if (piecesMap.containsKey(pieceName)) {
            System.out.printf("%s is already in the collection!%n", pieceName);
        } else {
            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            piecesMap.put(pieceName, pieceInfo);
            System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, key);
        }
    }

    private static void remove(Map<String, List<String>> piecesMap, String pieceName) {
        if (piecesMap.containsKey(pieceName)) {
            piecesMap.remove(pieceName);
            System.out.printf("Successfully removed %s!%n", pieceName);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
        }
    }

    private static void change(Map<String, List<String>> piecesMap, String pieceName, String newKey) {
        if (piecesMap.containsKey(pieceName)) {
            List<String> currentPieceInfo = piecesMap.get(pieceName);
            currentPieceInfo.remove(1);
            currentPieceInfo.add(newKey);
            piecesMap.put(pieceName, currentPieceInfo);
            System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
        }
    }
}
