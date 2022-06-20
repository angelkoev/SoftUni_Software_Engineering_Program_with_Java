import java.util.Scanner;

public class E05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        double totalScore = 0;

        int group0 = 0; // Invalud numbers:
        int group1 = 0; // 0 to 9
        int group2 = 0; // 10 to 19
        int group3 = 0; // 20 to 29
        int group4 = 0; // 30 to 39
        int group5 = 0; // 40 to 50


        for (int i = 1; i <= countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 50) {
                group0++;
                totalScore = totalScore / 2;
            } else if (number <= 9) {
                group1++;
                totalScore = totalScore + number * 0.2;
            } else if (number <= 19) {
                group2++;
                totalScore = totalScore + number * 0.3;
            } else if (number <= 29) {
                group3++;
                totalScore = totalScore + number * 0.4;
            } else if (number <= 39) {
                group4++;
                totalScore = totalScore + 50;
            } else if (number <= 50) {
                group5++;
                totalScore = totalScore + 100;
            }
        }

        System.out.printf("%.2f", totalScore);
        System.out.println();
        System.out.printf("From 0 to 9: %.2f%%", group1*1.0/countNumbers*100);
        System.out.println();
        System.out.printf("From 10 to 19: %.2f%%", group2*1.0/countNumbers*100);
        System.out.println();
        System.out.printf("From 20 to 29: %.2f%%", group3*1.0/countNumbers*100);
        System.out.println();
        System.out.printf("From 30 to 39: %.2f%%", group4*1.0/countNumbers*100);
        System.out.println();
        System.out.printf("From 40 to 50: %.2f%%", group5*1.0/countNumbers*100);
        System.out.println();
        System.out.printf("Invalid numbers: %.2f%%", group0*1.0/countNumbers*100);
    }
}
