package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //pokePower
        int m = Integer.parseInt(scanner.nextLine()); //distance
        int y = Integer.parseInt(scanner.nextLine()); // exhaustionFactor

        int nOriginalValue = n;
        int count = 0;

        while (n >= m) {
            n -= m;
            count++;
            if (n == nOriginalValue * 0.5 && y != 0) {
                n /= y;
            }

        }
        System.out.println(n);
        System.out.println(count);

    }
}
