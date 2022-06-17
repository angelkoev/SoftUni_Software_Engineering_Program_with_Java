import java.util.Scanner;

public class E04EvenPowersOf2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(Math.pow(2, i));
            }

        }

    }
}
