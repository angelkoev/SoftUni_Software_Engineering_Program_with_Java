package E03_Arrays_Exercise;

import java.util.Scanner;

public class E10TreasureHunt_withArray_Ignat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] chest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();


        while (!command.equals("Yohoho!")) {
            String[] commandArray = command.split("\\s+");

            switch (commandArray[0]) {
                case "Loot":

                    int counter = 0;
                    String[] temp = new String[commandArray.length - 1];

                    for (int i = 1; i < commandArray.length; i++) {
                        String currentItem = commandArray[i];
                        boolean isIn = false;

                        for (int j = 0; j < chest.length; j++) {
                            if (currentItem.equals(chest[j])) {
                                isIn = true;
                                break;
                            } else {
                                isIn = false;
                            }
                        }
                        if (!isIn) {
                            temp[counter] = currentItem;
                            counter++;
                        }
                    }

                    String[] result = new String[chest.length + counter];


                    for (int i = 0; i < counter; i++) {
                        result[i] = temp[counter - 1 - i];
                    }
                    for (int i = counter; i < result.length; i++) {
                        result[i] = chest[i - counter];
                    }

                    chest = result;
                    break;


                case "Drop":
                    int dropIndex = Integer.parseInt(commandArray[1]);

                    if (dropIndex >= 0 && dropIndex < chest.length) {
                        String current = chest[dropIndex];
                        for (int j = dropIndex; j < chest.length - 1; j++) {
                            chest[j] = chest[j + 1];
                        }
                        chest[chest.length - 1] = current;
                    }

                    break;
                case "Steal":
                    int stealCount = Integer.parseInt(commandArray[1]);

                    int smallest = Math.min(stealCount, chest.length);
                    String[] removedItems = new String[smallest];

                    for (int i = 0; i < removedItems.length; i++) {
                        removedItems[i] = chest[chest.length - 1 - i];
                    }

                    for (int i = 0; i < removedItems.length; i++) {
                        if (i < removedItems.length - 1) {
                            System.out.print(removedItems[removedItems.length - 1 - i] + ", ");
                        } else {
                            System.out.println(removedItems[0]);
                        }
                    }
                    String[] stealResult = new String[chest.length - stealCount];
                    for (int i = 0; i < stealResult.length; i++) {
                        stealResult[i] = chest[i];
                    }

                    chest = stealResult;

                    break;
            }
            command = scanner.nextLine();
        }


        int sum = 0;
        int count = 0;

        if (chest.length > 0) {
            for (int i = 0; i < chest.length; i++) {
                sum += chest[i].length();
                count++;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", sum * 1.0 / count);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
