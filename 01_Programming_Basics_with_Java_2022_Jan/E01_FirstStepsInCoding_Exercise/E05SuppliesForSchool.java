import java.util.Scanner;

public class E05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparati = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePens = pens * 5.8;
        double priceMarkers = markers * 7.2;
        double pricePreparati = preparati * 1.2;

        double totalPrice = pricePens + priceMarkers + pricePreparati;

        double discount = totalPrice * percent / 100;
//      ako procenta otstupka naprago vo gopozlvame, delim na 100.0, za da stane v double
//        double price = totalPrice - (totalPrice * percent / 100);

        double price = totalPrice - discount;

        System.out.println(price);

    }
}
