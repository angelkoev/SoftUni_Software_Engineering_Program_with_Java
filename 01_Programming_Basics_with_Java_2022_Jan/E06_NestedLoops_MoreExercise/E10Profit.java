import java.util.Scanner;

public class E10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLeva = Integer.parseInt(scanner.nextLine());
        int twoLeva = Integer.parseInt(scanner.nextLine());
        int fiveLeva = Integer.parseInt(scanner.nextLine());
        int neededMoney = Integer.parseInt(scanner.nextLine());

        boolean isSumOk = false;

        for (int i = 0; i <= oneLeva; i++) {
            for (int j = 0; j <= twoLeva; j++) {
                for (int k = 0; k <= fiveLeva; k++) {
                    isSumOk = false;
                    if ((i * 1) + (j * 2) + (k * 5) == neededMoney) {
                        isSumOk = true;
                    }
                    if (isSumOk) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j ,k, neededMoney);
                    }


                }
            }
        }


    }
}
