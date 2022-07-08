import java.util.Scanner;

public class E05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }

        System.out.printf("%.2f%%%n", p1 / count * 100);
        System.out.printf("%.2f%%%n", p2 / count * 100);
        System.out.printf("%.2f%%", p3 / count * 100);

    }
}
