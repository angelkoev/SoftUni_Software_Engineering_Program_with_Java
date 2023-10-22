package E10_FinalExamRetake04;

import java.util.Scanner;

public class E01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "TakeOdd":
                    String tempPass = "";
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            tempPass += password.charAt(i);
                        }
                    }
                    password = tempPass;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    password = password.substring(0, index) + password.substring(index + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String strToReplace = data[1];
                    String replacementStr = data[2];
                    if (password.contains(strToReplace)) {
                    password = password.replace(strToReplace, replacementStr);
                        System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }

}
