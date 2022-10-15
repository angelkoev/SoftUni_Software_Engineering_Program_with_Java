package E04_Methods_Lab;

import java.util.Scanner;

public class E09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();

        if (typeInput.equals("int")) {
            int input1 = Integer.parseInt(scanner.nextLine());
            int input2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(input1, input2));
        } else if (typeInput.equals("char")) {
            char input1 = scanner.nextLine().charAt(0);
            char input2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(input1, input2));
        } else if (typeInput.equals("string")) {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            System.out.println(getMax(input1, input2));
        }
    }

    public static int getMax(int input1, int input2) {
        if (input1 > input2) {
            return input1;
        } else {
            return input2;
        }
    }
    public static char getMax(char input1, char input2) {
        if (input1 > input2) {
            return input1;
        } else {
            return input2;
        }
    }
    public static String getMax(String input1, String input2) {
        if (input1.compareTo(input2) >= 0) {
            return input1;
        } else {
            return input2;
        }
    }

}
