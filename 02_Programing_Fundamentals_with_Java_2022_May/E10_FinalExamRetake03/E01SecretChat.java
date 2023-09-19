package E10_FinalExamRetake03;

import java.util.Scanner;

public class E01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = data[1];
                    if (message.indexOf(substring) > -1) {
                        reverse(substring, message);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    message = new StringBuilder(message.toString().replace(data[1], data[2]));
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", message);

    }

    private static void reverse(String substring, StringBuilder message) {
        int startIndex = message.indexOf(substring);
        message.delete(startIndex, startIndex + substring.length());
        String temp = "";
        for (int i = substring.length()-1; i >= 0; i--) {
            temp += substring.charAt(i);
        }
        message.append(temp);
    }
}
