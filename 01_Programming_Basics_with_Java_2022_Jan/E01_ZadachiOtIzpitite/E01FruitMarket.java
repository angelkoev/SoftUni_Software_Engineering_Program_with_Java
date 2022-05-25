import java.util.Scanner;

public class E01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgMalini = Double.parseDouble(scanner.nextLine());
        double kgStrawberry = Double.parseDouble(scanner.nextLine());

//        •	цената на малините е на половина по-ниска от тази на ягодите;
//        •	цената на портокалите е с 40% по-ниска от цената на малините;
//        •	цената на бананите е с 80% по-ниска от цената на малините.


        double priceMalini = priceStrawberry / 2;
//        System.out.println(priceMalini);
        double priceOranges = priceMalini * 0.6;
//        System.out.println(priceOranges);
        double priceBananas = priceMalini * 0.2;
//        System.out.println(priceBananas);

        double totalStrawberry = kgStrawberry * priceStrawberry;
//        System.out.println(totalStrawberry);
        double totalMalini = kgMalini * priceMalini;
//        System.out.println( totalMalini);
        double totalOranges = kgOranges * priceOranges;
//        System.out.println(totalOranges);
        double totalBananas = kgBananas * priceBananas;
//        System.out.println(totalBananas);

        double result = totalMalini + totalBananas + totalOranges + totalStrawberry;

        System.out.printf("%.2f", result);



    }
}
