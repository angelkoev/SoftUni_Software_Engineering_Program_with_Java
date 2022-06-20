import java.util.Scanner;
                        // решение от Mitko Mitaka
public class E01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        int yearsCount = 0;

        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                inheritedMoney = inheritedMoney - 12000;
                yearsCount++;
            } else {
                inheritedMoney = inheritedMoney - 12000 - 50 * (18 + yearsCount);
                yearsCount++;
            }

        }

        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }

    }
}
