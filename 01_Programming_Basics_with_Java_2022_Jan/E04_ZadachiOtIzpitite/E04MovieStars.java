import java.util.Scanner;

public class E04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        boolean noMoreMoney = false;


        String input = scanner.nextLine();

        while (!input.equals("ACTION")) {

            if (input.length() <= 15) {
                double fee = Double.parseDouble(scanner.nextLine());
                budget = budget - fee;
            } else {
                budget = budget * 0.8;
            }

            if (budget < 0) {
                noMoreMoney = true;
                break;
            }

            input = scanner.nextLine();

        }

        if (noMoreMoney) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }


    }
}
