import java.util.Scanner;

public class E01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//        •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//        •	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//        •	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int tax = Integer.parseInt(scanner.nextLine());

        double priceSneakers = tax * 0.6;
        double priceSuit = priceSneakers * 0.8;
        double priceBall = priceSuit / 4;
        double priceAcc = priceBall / 5;

        double total = tax + priceSneakers + priceSuit + priceBall + priceAcc;

        System.out.printf("%.2f", total);


    }
}
