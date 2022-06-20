import java.util.Scanner;

public class E01BackToThePast_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int YearInThePast = 1800;
        double money = Double.parseDouble(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine()) - YearInThePast;

        for (int i = 0; i <= age; i++) {
            if (i % 2 == 0) money -= 12000;
            else money -= 12000 + 50 * (i + 18);
        }

        if (money >= 0) System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        else System.out.printf("He will need %.2f dollars to survive.",Math.abs(money));
    }
}

