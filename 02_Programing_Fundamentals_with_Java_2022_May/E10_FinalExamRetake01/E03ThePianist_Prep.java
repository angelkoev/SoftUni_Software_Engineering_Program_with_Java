package E10_FinalExamRetake01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E03ThePianist_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Piece> pieceMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            String pieceName = data[0];
            String composer = data[1];
            String key = data[2];

            Piece currentPiece = new Piece(pieceName, composer, key);

            pieceMap.put(pieceName, currentPiece);

        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] data = input.split("\\|");
            String command = data[0];
            String pieceName = data[1];

            switch (command) {
                case "Add":
                    String composer = data[2];
                    String key = data[3];
                    if (pieceMap.containsKey(pieceName)) {
                        System.out.println(pieceName + " is already in the collection!");
                    } else {
                        Piece currentPiece = new Piece(pieceName, composer, key);
                        pieceMap.put(pieceName, currentPiece);
                        System.out.println(pieceName + " by " + composer + " in " + key + " added to the collection!");
                    }
                    break;
                case "Remove":
                    if (pieceMap.containsKey(pieceName)) {
                        pieceMap.remove(pieceName);
                        System.out.println("Successfully removed " + pieceName + "!");
                    } else {
                        System.out.println("Invalid operation! " + pieceName + " does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String newKey = data[2];
                    if (pieceMap.containsKey(pieceName)) {
                        Piece currentPiece = pieceMap.get(pieceName);
                        currentPiece.setKey(newKey);
                        System.out.println("Changed the key of " + pieceName + " to " + newKey + "!");
                    } else {
                        System.out.println("Invalid operation! " + pieceName + " does not exist in the collection.");
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        pieceMap.values().forEach(System.out::println);

    }

    public static class Piece {
        private String piece;
        private String composer;
        private String key;

        public Piece(String piece, String composer, String key) {
            this.piece = piece;
            this.composer = composer;
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", this.piece, this.composer, this.key);
        }
    }
}
