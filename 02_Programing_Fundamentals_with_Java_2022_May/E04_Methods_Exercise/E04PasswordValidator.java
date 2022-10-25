package E04_Methods_Exercise;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        passLengthValidation(pass);
        isConsistOnlyLettersAndDigits(pass);
        hasAtLeast2Digits(pass);

        if (passLengthValidation(pass) && isConsistOnlyLettersAndDigits(pass) && hasAtLeast2Digits(pass)) {
            System.out.println("Password is valid");
        }
        if (!passLengthValidation(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyLettersAndDigits(pass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasAtLeast2Digits(pass)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean passLengthValidation(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    private static boolean isConsistOnlyLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasAtLeast2Digits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count++;
                if (count == 2) {   // ако стане 2, връщаме true и няма смисъл да проверяваме всички символи
                    return true;
                }
            }
        }
        return false;

    }
}

