import java.util.Scanner;

public class E06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double currentPrice = 0;
        double totalPrice = 0;


        for (int i = 1; i <= days; i++) {

            currentPrice = 0;

            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    currentPrice += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    currentPrice += 1.25;
                } else {
                    currentPrice += 1;
                }

            }
            totalPrice += currentPrice;
            System.out.printf("Day: %d - %.2f leva%n", i, currentPrice);
        }
        System.out.printf("Total: %.2f leva", totalPrice);

    }
}
