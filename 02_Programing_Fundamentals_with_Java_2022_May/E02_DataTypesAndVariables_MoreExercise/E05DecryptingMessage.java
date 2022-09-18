package E02_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class E05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            currentChar += key;
            System.out.print(currentChar);
        }

    }
}
