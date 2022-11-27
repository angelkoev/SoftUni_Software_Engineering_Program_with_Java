package E05_MidExam_26_June_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 15 min

public class E03_DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfCards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String data[] = scanner.nextLine().split(", ");
            String command = data[0];

            switch (command) {
                case "Add":
                    String cardName = data[1];
                    if (listOfCards.contains(cardName)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        listOfCards.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    cardName = data[1];
                    if (listOfCards.contains(cardName)) {
                        listOfCards.remove(cardName);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int indexToRemove = Integer.parseInt(data[1]);
                    if (isIndexValid(indexToRemove, listOfCards.size())) {
                        listOfCards.remove(indexToRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(data[1]);
                    cardName = data[2];
                    if (isIndexValid(indexToInsert, listOfCards.size())) {
                        if (listOfCards.contains(cardName)) {
                            System.out.println("Card is already added");
                        } else {
                            listOfCards.add(indexToInsert, cardName);
                            System.out.println("Card successfully added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", listOfCards));

    }
    public static boolean isIndexValid (int index, int size) {
        return 0 <= index && index < size;
    }
}
