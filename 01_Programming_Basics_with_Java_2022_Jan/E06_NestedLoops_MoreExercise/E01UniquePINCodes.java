import java.util.Scanner;

public class E01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        boolean isPrime = false;

        for (int i = 2; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                isPrime = false;
                int count = 0;
                                                    // ot tuk nadolu proveriavame dali chisloto e prime
                for (int k = 1; k <= j; k++) {    // tuka e vajno ot koia do koia cifra e
                    if (j % k == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    isPrime = true;   // ot gore do tuk proveriavame dali chisloto j e prime
                }
                for (int k = 2; k <= num3; k++) {
                    if (i % 2 == 0 && isPrime && k % 2 == 0) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }

    }
}
