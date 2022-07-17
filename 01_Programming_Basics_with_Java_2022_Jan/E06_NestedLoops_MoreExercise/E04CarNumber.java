import java.util.Scanner;

public class E04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end; k++) {
                    for (int l = start; l <= end; l++) {
                        isValid = false;

                        if (i > l) {
                            if ((j + k) % 2 == 0) {
                                if ((i % 2 != 0 && l % 2 == 0) || (i % 2 == 0 && l % 2 != 0)) {
                                    isValid = true;
                                }
                            }
                        }

                        if (isValid) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }

                    }
                }
            }
        }

    }
}
