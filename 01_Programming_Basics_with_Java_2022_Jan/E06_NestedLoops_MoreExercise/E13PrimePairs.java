import java.util.Scanner;

public class E13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start1 = Integer.parseInt(scanner.nextLine());
        int start2 = Integer.parseInt(scanner.nextLine());
        int end1 = Integer.parseInt(scanner.nextLine());
        int end2 = Integer.parseInt(scanner.nextLine());

        boolean isPrime1 = false;
        boolean isPrime2 = false;

        for (int i = start1; i <= start1 + end1; i++) {
            isPrime1 = false;
            int count1 = 0;
            for (int k = 1; k <= i ; k++) {
                if (i % k == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                isPrime1 = true;
            }

            for (int j = start2; j <= start2 + end2; j++) {
                isPrime2 = false;
                int count2 = 0;
                for (int k = 1; k <= j ; k++) {
                    if (j % k == 0) {
                        count2++;
                    }
                }
                if (count2 == 2) {
                    isPrime2 = true;
                }

                if (isPrime1 && isPrime2) {
                    System.out.printf("%d%d%n", i, j);
                }

            }
        }

    }
}
