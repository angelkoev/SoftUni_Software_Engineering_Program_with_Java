import java.util.Scanner;

public class E06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int digit1 = number % 10;
        int digit2 = number / 10 % 10;
        int digit3 = number / 100 % 10;


        for (int i = 1; i <= digit1; i++) {
            for (int j = 1; j <= digit2; j++) {
                for (int k = 1; k <= digit3; k++) {

                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, k * j * i);
                }
            }
        }


    }
}
