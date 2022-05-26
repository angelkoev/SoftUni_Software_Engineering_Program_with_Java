import java.util.Scanner;

public class E01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRacket = Double.parseDouble(scanner.nextLine());
        int rackets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double priceSneakers = priceRacket / 6;
//        System.out.println(priceSneakers);

        double totalPriceRackets = priceRacket * rackets;
//        System.out.println( totalPriceRackets);
        double totalPriceSneakers = priceSneakers * sneakers;
//        System.out.println(totalPriceSneakers);
        double totalPriceRS = totalPriceRackets + totalPriceSneakers;
//        System.out.println(totalPrice);
        double otherEquip = totalPriceRS * 0.2;

        double totalPrice = totalPriceRS + otherEquip;

        double djokovichPrice = Math.floor(totalPrice / 8);
        double sponsorsPrice = Math.ceil(totalPrice * 7 / 8);

//        System.out.println(djokovichPrice);
//        System.out.println( sponsorsPrice);

//        int djokovichPriceInt = (int) djokovichPrice;
//        System.out.println(djokovichPriceInt);
//        int sponsorsPriceInt = (int) sponsorsPrice;
//     System.out.println(sponsorsPriceint);

//        System.out.printf("Price to be paid by Djokovic %d %n", djokovichPriceInt);
//        System.out.printf("Price to be paid by sponsors %d", sponsorsPriceInt);

//        System.out.println();
        System.out.printf("Price to be paid by Djokovic %.0f %n", djokovichPrice);
        System.out.printf("Price to be paid by sponsors %.0f", sponsorsPrice);


    }
}
