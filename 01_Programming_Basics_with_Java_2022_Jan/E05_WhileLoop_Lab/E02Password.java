import java.util.Scanner;

public class E02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {
            enteredPassword = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);


    }
}
