package E02_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class E06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);

        String result = "";

        System.out.println(result + a + b + c);

    }
}
