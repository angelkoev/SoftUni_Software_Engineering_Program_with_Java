import java.util.Scanner;

public class E01Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int museumCards = Integer.parseInt(scanner.nextLine());

        double priceForNights = nights * people * 20;
        double priceForTransport = transportCards * people * 1.6;
        double prifeForMuseums = museumCards * people * 6;

        double sum = priceForNights + priceForTransport + prifeForMuseums;

        double totalSum = sum * 1.25;

        System.out.printf("%.2f", totalSum);



    }
}
