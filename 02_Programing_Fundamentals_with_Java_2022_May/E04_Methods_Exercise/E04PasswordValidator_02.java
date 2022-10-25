package E04_Methods_Exercise;

import java.util.Scanner;

public class E04PasswordValidator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLenght = isValidLength(password);

        if (!isValidLenght) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isValidContent(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidCount = isValidCountDigits(password);
        if (!isValidCount) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLenght && isValidContent && isValidCount) {
            System.out.println("Password is valid");
        }

    }

    private static boolean isValidLength(String password) {

        return password.length() >= 6 && password.length() <= 10; // това е същото като долното закоментираното
//        if (password.length() >= 6 && password.length() <= 10) {
//            return true;
//        } else {
//            return false;
//        }
    }

    private static boolean isValidContent(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (!Character.isLetterOrDigit(currentSymbol)) {   // с това трябва само 1 проверка
//            if (!Character.isLetter(currentSymbol) || !Character.isDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                count++;
            }
        }
        return count >= 2;
    }

}
