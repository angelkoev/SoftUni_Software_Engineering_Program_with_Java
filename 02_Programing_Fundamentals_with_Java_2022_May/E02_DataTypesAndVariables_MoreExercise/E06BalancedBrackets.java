package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.charAt(0) == 40) {
                count++;
            }
            if (input.charAt(0) == 41) {
                count--;
            }
            if (count > 1 || count < 0) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
