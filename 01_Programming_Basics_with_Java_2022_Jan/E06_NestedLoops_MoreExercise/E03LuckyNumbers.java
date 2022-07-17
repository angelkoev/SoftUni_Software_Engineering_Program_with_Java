import java.util.Scanner;

public class E03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isLucky = false;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {
                        isLucky = false;
                        if ((i + j) == (k + l) && n % (i + j) == 0) {
                            isLucky = true;
                        }
                        if (isLucky) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }

                    }
                }
            }
        }


    }
}
