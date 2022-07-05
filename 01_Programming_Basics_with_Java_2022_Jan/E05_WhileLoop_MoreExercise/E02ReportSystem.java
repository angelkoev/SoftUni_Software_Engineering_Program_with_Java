import java.util.Scanner;

public class E02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());

        int totalCountPays = 0;
        int cashPays = 0;
        int countCashPays = 0;
        int creditCardPays = 0;
        int countCreditCardsPays = 0;
        boolean succeed = false;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int number = Integer.parseInt(input);
            if (totalCountPays % 2 == 0) {
                if (number <= 100) {
                    cashPays = cashPays + number;
                    countCashPays++;
                    totalCountPays++;
                    neededMoney = neededMoney - number;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                    totalCountPays++;
                }
            } else{
                if (number > 10) {
                    creditCardPays = creditCardPays + number;
                    countCreditCardsPays++;
                    totalCountPays++;
                    neededMoney = neededMoney - number;
                    System.out.println("Product sold!");
                } else {
                    totalCountPays++;
                    System.out.println("Error in transaction!");
                }
            }
            if (neededMoney <= 0) {
                succeed = true;
                break;
            }
            input = scanner.nextLine();

        }

        if (succeed) {
            System.out.printf("Average CS: %.2f", cashPays * 1.0 / countCashPays);
            System.out.println();
            System.out.printf("Average CC: %.2f", creditCardPays * 1.0 / countCreditCardsPays);
        }
        else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
