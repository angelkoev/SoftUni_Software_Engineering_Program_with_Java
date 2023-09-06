package E10_FinalExamRetake01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO -> 83/100 с class, ама за сега не ми се търси грешката. Ще я реша с мап !!!

public class E03ThePianist_withClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<musicCollection> allCollection = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("[|]");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];
            musicCollection currentMusic = new musicCollection(piece, composer, key);
            allCollection.add(currentMusic);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String data[] = input.split("[|]");
            String action = data[0];
            String piece = data[1];
            switch (action) {
                case "Add":
                    String composer = data[2];
                    String key = data[3];
                    add(allCollection, piece, composer, key);
                    break;
                case "Remove":
                    remove(allCollection, piece);
                    break;
                case "ChangeKey":
                    String newKey = data[2];
                    change(allCollection, piece, newKey);
                    break;
            }


            input = scanner.nextLine();
        }


        for (musicCollection musicCollection : allCollection) {
            System.out.println(musicCollection);
        }


    }

    private static void add(List<musicCollection> allCollection, String piece, String composer, String key) {
        for (musicCollection musicCollection : allCollection) {
            if (musicCollection.getPiece().equals(piece)) {
                System.out.printf("%s is already in the collection!%n", piece);
                break;
            } else {
                musicCollection currentMusic = new musicCollection(piece, composer, key);
                allCollection.add(currentMusic);
                System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                break;
            }
        }
    }

    private static void remove(List<musicCollection> allCollection, String piece) {
        boolean isRemoved = false;
        for (musicCollection musicCollection : allCollection) {
            if (musicCollection.getPiece().equals(piece)) {
                allCollection.remove(musicCollection);
                System.out.printf("Successfully removed %s!%n", piece);
                isRemoved = true;
                break;
            }

        }
        if (!isRemoved) {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }
//            if (musicCollection.getPiece().equals(piece)) {
//                allCollection.remove(musicCollection);
//                System.out.printf("Successfully removed %s!%n", piece);
//                break;
//            } else {
//                System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
//            }


    private static void change(List<musicCollection> allCollection, String piece, String newKey) {
        boolean isPresent = false;
        for (musicCollection musicCollection : allCollection) {
            if (musicCollection.getPiece().equals(piece)) {
                musicCollection.setKey(newKey);
                System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                isPresent = true;
                break;
            }

        }
        if (!isPresent) {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }

    public static class musicCollection {

        String piece = "";
        String composer = "";
        String key = "";

        public musicCollection(String piece, String composer, String key) {
            this.piece = piece;
            this.composer = composer;
            this.key = key;
        }

        public String getPiece() {
            return piece;
        }

        public void setPiece(String piece) {
            this.piece = piece;
        }

        public String getComposer() {
            return composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
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
