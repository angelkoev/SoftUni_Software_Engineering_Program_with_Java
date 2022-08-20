package E01_BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String userPassowrd = scanner.nextLine();
        String password = "";
        int count = 0;

        for (int i = 0; i < 4; i++) {
            count++;
            password = "";
            for (int j = userPassowrd.length() - 1; j >= 0; j--) {
                password += userPassowrd.charAt(j);
            }

            if (password.equals(username)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (count == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.printf("Incorrect password. Try again.%n");
            }

            userPassowrd = scanner.nextLine();


        }
    }

}
