package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean isOnlyNumbers = false;
            int pointerCount = 0;

            for (int i = 0; i < input.length(); i++) {

                if (input.charAt(0) == 45 && i == 0) {
                    continue;
                }
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    isOnlyNumbers = true;
                } else {
                    if (input.charAt(i) == 46) {
                        pointerCount++;
                    } else {
                        isOnlyNumbers = false;
                        break;
                    }
                }
            }
            if (isOnlyNumbers && pointerCount == 0) {
                System.out.printf("%s is integer type%n", input);
            } else if (isOnlyNumbers && pointerCount == 1) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() == 1) {
                if (input.charAt(0) > 47 && input.charAt(0) < 58) {
                    System.out.printf("%s is integer type%n", input);
                } else {
                    System.out.printf("%s is character type%n", input);
                }
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}

