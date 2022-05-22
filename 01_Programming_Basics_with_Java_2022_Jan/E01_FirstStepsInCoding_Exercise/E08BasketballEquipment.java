import java.util.Scanner;

public class E08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

//        •	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//        •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//        •	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//        •	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double priceShoes = yearTax - (yearTax* 0.40);
        double priceSuit = priceShoes - (priceShoes * 0.20);
        double priceBall = priceSuit / 4;
        double priceAcc = priceBall / 5;

        double totalSum = yearTax + priceShoes + priceSuit + priceBall + priceAcc;

        System.out.println(totalSum);

    }
}