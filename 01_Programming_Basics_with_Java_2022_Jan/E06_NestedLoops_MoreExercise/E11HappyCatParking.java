import java.util.Scanner;

public class E11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double dayPrice = 0;
        double totalPrice = 0;


        for (int i = 1; i <= days; i++) {
            dayPrice = 0;
            for (int j = 1; j <=hours ; j++) {

                if (i % 2 == 0 && j % 2 !=0) {
                    dayPrice = dayPrice + 2.5;
                } else if (i % 2 != 0 && j % 2 ==0) {
                    dayPrice = dayPrice + 1.25;
                } else {
                    dayPrice = dayPrice + 1;
                }

            }
            System.out.printf("Day: %d - %.2f leva%n",i, dayPrice );
            totalPrice = totalPrice + dayPrice;
        }

        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
