import java.util.Scanner;

public class E04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int countToys = 0;
        int allMoney = 0;
        int brothercount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                allMoney = allMoney + money;
                brothercount++;
            } else {
                countToys++;
            }

        }

        double sumToys = countToys * priceToy;

//        System.out.println(allMoney);
//        System.out.println(sumToys);

        double allSum = allMoney + sumToys - brothercount*1.0;

        double diff = Math.abs(allSum - priceWasher);

        if (allSum >= priceWasher) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
