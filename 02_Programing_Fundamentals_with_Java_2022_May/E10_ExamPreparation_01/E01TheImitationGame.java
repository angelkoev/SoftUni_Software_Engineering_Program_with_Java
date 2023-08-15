package E10_ExamPreparation_01;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2525#0
public class E01TheImitationGame {
    public static void main(String[] args) {

//        System.out.println(move("abcd", 0));
//        System.out.println(move("abcd", 1));
//        System.out.println(move("abcd", 2));  // с това си тестваме първия метод
//        System.out.println(move("abcd", 3));  // добре е да си тестваме всички методи по отделно !!!
//        System.out.println(move("abcd", 4));

        // може да се направи оптимизация... примерно със StringBuilder
        // ако се прави оптимизация, е добре да си копираме работещия код в нов java class и да променяме само новия java class
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                case "ChangeAll":
                    message = changeAll (message, commandParts[1], commandParts[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + commandName + " in " + command);
            }

            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);

    }

    private static String move(String message, int length) {
        String firstPart = message.substring(0, length);
        String secondPart = message.substring(length);
        return secondPart + firstPart;
    }

    private static String insert(String message, int index, String substr) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);
        return firstPart + substr + secondPart;
    }

    private static String changeAll(String message, String substr, String replacement) {
        return message.replace(substr, replacement);
    }
}
