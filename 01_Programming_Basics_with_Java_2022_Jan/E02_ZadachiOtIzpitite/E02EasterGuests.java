import java.util.Scanner;

public class E02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceEggs = guestCount * 2 * 0.45;
        double kozunakCount = Math.ceil(guestCount * 1.0 / 3);
        double priceKozunak = kozunakCount * 4;

        double totalPrice = priceEggs + priceKozunak;

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", kozunakCount, guestCount * 2);
            System.out.printf("He has %.2f lv. left.", diff);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", diff);
        }


    }
}
