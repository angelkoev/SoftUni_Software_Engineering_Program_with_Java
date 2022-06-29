import java.util.Scanner;

public class E04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int total = 0;

        for (int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 6) {
                total += number;
                p1 += number;
            } else if (number < 13) {
                total += number;
                p2 += number;
            } else if (number < 26) {
                total += number;
                p3 += number;
            } else if (number < 41) {
                total += number;
                p4 += number;
            } else {
                total += number;
                p5 += number;
            }
        }

        System.out.printf("%.2f%%%n", p1*1.0/total*100);
        System.out.printf("%.2f%%%n", p2*1.0/total*100);
        System.out.printf("%.2f%%%n", p3*1.0/total*100);
        System.out.printf("%.2f%%%n", p4*1.0/total*100);
        System.out.printf("%.2f%%%n", p5*1.0/total*100);

    }
}
