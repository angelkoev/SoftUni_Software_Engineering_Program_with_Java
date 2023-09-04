package E10_FinalExamRetake01;

import java.util.*;

// https://judge.softuni.org/Contests/Practice/Index/2525#2
public class E03ThePianist_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        System.out.println();
        int countPieces = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countPieces; i++) {
            String[] pieceParts = scanner.nextLine().split("\\|");
            String pieceName = pieceParts[0];
            String composer = pieceParts[1];
            String key = pieceParts[2];

            List <String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            piecesMap.put(pieceName, pieceInfo);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add":
                    String newPieceName = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];
                    if (piecesMap.containsKey(newPieceName)) {
                        System.out.printf("%s is already in the collection!%n", newPieceName);
                    } else {
                        List<String> newPieceInfo = new ArrayList<>();
                        newPieceInfo.add(composer);
                        newPieceInfo.add(key);
                        piecesMap.put(newPieceName, newPieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n", newPieceName, composer, key);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = commandParts[1];
                    if (piecesMap.containsKey(pieceToRemove)) {
                        piecesMap.remove(pieceToRemove);
                    System.out.printf("Successfully removed %s!%n", pieceToRemove);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                }
                    break;
                case "ChangeKey":
                    String pieceName = commandParts[1];
                    String newKey = commandParts[2];
                    if (!piecesMap.containsKey(pieceName)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    } else {
                        List<String> currentPieceInfo = piecesMap.get(pieceName);
                        currentPieceInfo.remove(1);
                        currentPieceInfo.add(newKey);
                        piecesMap.put(pieceName, currentPieceInfo);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    }

                    break;
            }


            command = scanner.nextLine();
        }

        piecesMap.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
