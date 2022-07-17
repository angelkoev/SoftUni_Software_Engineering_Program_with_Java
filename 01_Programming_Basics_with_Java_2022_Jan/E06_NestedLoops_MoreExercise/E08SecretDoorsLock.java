import java.util.Scanner;

public class E08SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//копирах 1ва задача, защото са 1 към 1
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        boolean isNum2Prime = false;

        for (int i = 2; i <= num1; i++) {
            for (int j = 2; j <= num2; j++) {
                for (int k = 2; k <= num3; k++) {
                    isNum2Prime = false;
                    if (j != 4 && j != 6 && j <= 7) {
                        isNum2Prime = true;
                    }
                    if (i % 2 == 0 && isNum2Prime && k % 2 == 0) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }

    }
}
