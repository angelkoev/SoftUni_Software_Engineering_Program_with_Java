package E05_MidExam_26_June_2022;

import java.util.Scanner;
// 10 min
public class E01_BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0.0;

        for (int i = 1; i <= number; i++) {
            String cityName = scanner.nextLine();
            double moneyByCity = Double.parseDouble(scanner.nextLine());
            double expensesByCity = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0 && i % 5 != 0) {
                expensesByCity *= 1.5;
            }

            if (i % 5 == 0) {
                moneyByCity *= 0.9;
            }

            double cityProfit = moneyByCity - expensesByCity;

            totalMoney += cityProfit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, cityProfit);


        }

        System.out.printf("Burger Bus total profit: %.2f leva.", totalMoney);

    }
}
