package E10_FinalExamRetake03;

import java.util.Scanner;

public class E01SecretChat_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message = message.substring(0, index) + " " + message.substring(index);
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substringToReverse = data[1];
                    if (message.contains(substringToReverse)) {
                        StringBuilder toReverse = new StringBuilder(substringToReverse);
                        toReverse.reverse();
                        int indexOf = message.indexOf(substringToReverse);
                        message = message.substring(0, indexOf) + message.substring(indexOf + substringToReverse.length());
                        message = message + toReverse.toString();
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    message = message.replace(substring, replacement);
                    System.out.println(message);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + message);

    }
}
