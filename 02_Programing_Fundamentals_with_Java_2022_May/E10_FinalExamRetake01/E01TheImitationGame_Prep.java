package E10_FinalExamRetake01;

import java.util.Scanner;

public class E01TheImitationGame_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] data = input.split("\\|");
            String instruction = data[0];
            switch (instruction) {
                case "Move":
                    int numOfLetters = Integer.parseInt(data[1]);
                    message = message.substring(numOfLetters) + message.substring(0, numOfLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    message = message.substring(0, index) + value + message.substring(index);
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    message = message.replace(substring, replacement);
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);

    }
}
