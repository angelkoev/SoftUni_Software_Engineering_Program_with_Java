import java.util.Scanner;

public class E04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedIncome = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        double price = 0;

        double clubIncome = 0;
        double orderPrice = 0;
        boolean targetReached = false;



        while (!input.equals("Party!")) {

            price = input.length();

            int count = Integer.parseInt(scanner.nextLine());

            orderPrice = price * count;

            if (orderPrice % 2 != 0) {
                orderPrice = orderPrice * 0.75;
            }


            clubIncome = clubIncome + orderPrice;

            if (clubIncome >= wantedIncome) {
                targetReached = true;
                break;
            }

            input = scanner.nextLine();


        }

        if (targetReached) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.",clubIncome);
        } else {
            System.out.printf("We need %.2f leva more.%n", wantedIncome - clubIncome);
            System.out.printf("Club income - %.2f leva.", clubIncome);
        }



    }
}
