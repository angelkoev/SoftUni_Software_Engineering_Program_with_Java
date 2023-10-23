package E10_FinalExamRetake04;

import java.util.Scanner;

public class E01PasswordReset_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "TakeOdd":
                    String newPass = "";
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            newPass += "" + password.charAt(i);
                        }
                    }
                    password = newPass;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    String substringToRemove = password.substring(index, index + length);
                    int indexOf = password.indexOf(substringToRemove);
                    password = password.substring(0, indexOf) + password.substring(indexOf + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substringToReplace = data[1];
                    String replacement = data[2];
                    if (password.contains(substringToReplace)) {
                        password = password.replace(substringToReplace, replacement);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);

    }
}
