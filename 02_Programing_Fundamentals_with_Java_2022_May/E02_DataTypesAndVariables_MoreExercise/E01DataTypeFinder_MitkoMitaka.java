package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E01DataTypeFinder_MitkoMitaka {

    static boolean typeBoolean(String text) {
        String True = "true";
        String False = "false";

        if (text.toLowerCase().equals(True) || text.toLowerCase().equals(False)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean typeChar(String text) {
        if ((text.length() == 1) && (((int) text.charAt(0) < 48) || ((int) text.charAt(0) > 57))) {
            return true;
        } else {
            return false;
        }
    }

    static boolean typeInteger(String text) {
        try {
            int num = Integer.parseInt(text);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    static boolean typeFloat(String text) {
        try {
            double num = Double.parseDouble(text);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String element = scanner.nextLine();
        String end = "END";

        while (!element.equals(end)) {
            if (typeBoolean(element)) {
                System.out.printf("%s is boolean type%n", element);
            } else if (typeChar(element)) {
                System.out.printf("%s is character type%n", element);
            } else if (typeInteger(element)) {
                System.out.printf("%s is integer type%n", element);
            } else if (typeFloat(element)) {
                System.out.printf("%s is floating point type%n", element);
            } else {
                System.out.printf("%s is string type%n", element);
            }

            element = scanner.nextLine();
        }
    }
}