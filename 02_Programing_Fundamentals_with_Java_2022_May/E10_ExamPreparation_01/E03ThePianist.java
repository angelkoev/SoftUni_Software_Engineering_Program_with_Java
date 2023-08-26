package E10_ExamPreparation_01;

import java.util.*;

//https://judge.softuni.org/Contests/Practice/Index/2525#2

public class E03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();


        for (int i = 0; i < countPieces; i++) {
            String[] info = scanner.nextLine().split("\\|");

            String piece = info[0];
            String composer = info[1];
            String key = info[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);

            piecesMap.put(piece, pieceInfo);

        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] tokens = input.split("\\|");

            String command = tokens[0];
            String piece = tokens[1];

            switch (command) {
                case "Add":
                    String composer = tokens[2];
                    String key = tokens[3];
                    if (piecesMap.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    } else {
                        List<String> pieceInfo = new ArrayList<>();
                        pieceInfo.add(composer);
                        pieceInfo.add(key);
                        piecesMap.put(piece, pieceInfo);
                        System.out.println(piece + " by " + composer + " in " + key + " added to the collection!");
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.remove(piece);
                        System.out.println("Successfully removed " + piece + "!");
                    } else {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String newKey = tokens[2];
                    if (piecesMap.containsKey(piece)) {
                        List<String> currentInfo = piecesMap.get(piece);
//                        info.add(1, newKey);
//                        info.set(1, newKey);
                        currentInfo.remove(1);
                        currentInfo.add(newKey);
                        piecesMap.put(piece, currentInfo);
//                        System.out.println("Changed the key of " + piece + " to " + newKey + "!");
                        System.out.printf("Changed asdasd the key of %s to %s!%n", piece, newKey);
                    } else {
//                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        //TODO PRINT

//        piecesMap.forEach((k, v ) -> System.out.printf("%s -> Composer: %s, Key: %s%n", k, v.get(0), v.get(1)));

        piecesMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


    }
}
