package E10_FinalExamRetake01;

import java.util.Scanner;

public class E01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        StringBuilder decryptedMsg = new StringBuilder(encryptedMessage);

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] data = input.split("[|]");
            String commandName = data[0];

            switch (commandName) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(data[1]);
                    moveLetters(decryptedMsg, numberOfLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    insertAtIndex(decryptedMsg, index, value);
                    break;
                case "ChangeAll":
                    String firstLetter = data[1];
                    char secondLetter = data[2].charAt(0);
                    changeAllLetters(decryptedMsg, firstLetter, secondLetter);
                    break;


            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", decryptedMsg);

    }

    private static void moveLetters(StringBuilder encryptedMsg, int numberOfLetters) {
        String temp = encryptedMsg.substring(0, numberOfLetters);
        encryptedMsg.delete(0, numberOfLetters);
        encryptedMsg.append(temp);
    }

    private static void insertAtIndex(StringBuilder decryptedMsg, int index, String value) {
        decryptedMsg.insert(index, value);
    }

    private static void changeAllLetters(StringBuilder decryptedMsg, String firstLetter, char secondLetter) {
        for (int i = 0; i < decryptedMsg.length(); i++) {

            int index = decryptedMsg.indexOf(firstLetter);
            if (index == -1) {
                break;
            } else {
                decryptedMsg.setCharAt(index, secondLetter);
            }
        }
    }
}
