package E04_Methods_MoreExercise;

import java.util.Scanner;

public class E01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        if (input.equals("int")) {
            System.out.println(findInd(input2) * 2);
        } else if (input.equals("real")) {
            System.out.printf("%.2f", findReal(input2) * 1.5);
        } else {
            System.out.println("$" + input2 + "$");
        }


    }
    private static int findInd(String input2) {
        return Integer.parseInt(input2);
    }

    private static double findReal(String input2) {
        return Double.parseDouble(input2);
    }
}
