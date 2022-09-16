package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;   //ne e reshena ok !!! dava samo 50/100

public class E01DataTypeFinder_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean isFloating = false;
            boolean isString = false;
//            int floatingCount = 0;
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == 46 && (input.charAt(0) > 48 || input.charAt(0) < 57)) {
                    isFloating = true;

                }
            }
//            if (input % 1 == 0) {
//                isFloating = false
//            } else {
//                isFloating = true;
//            }

            if (isFloating) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() == 1 && (input.charAt(0) < 48 || input.charAt(0) > 57)) {
                System.out.printf("%s is character type%n", input);
            } else if (input.length() > 1 && (input.charAt(0) < 48 || input.charAt(0) > 57) && (input.charAt(1) < 48 || input.charAt(1) > 57)) {
                System.out.printf("%s is string type%n", input);
            } else if (input.length() >= 1) {
                boolean isInteger = false;
                if (input.charAt(0) == 45) {
                    for (int i = 1; i < input.length(); i++) {
                        if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                            isInteger = true;
                        } else {
                            isInteger = false;
                            isString = true;
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                            isInteger = true;
                        } else {
                            isInteger = false;
                            isString = true;
                            break;
                        }
                    }
                }

                if (isInteger) {
                    System.out.printf("%s is integer type%n", input);
                }
            }
            if (isString) {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}