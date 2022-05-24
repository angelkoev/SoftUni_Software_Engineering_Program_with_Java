import java.util.Scanner;

public class E01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKGBrashno = Double.parseDouble(scanner.nextLine());
        double KGBrashno = Double.parseDouble(scanner.nextLine());
        double KGZahar = Double.parseDouble(scanner.nextLine());
        double Eggs = Double.parseDouble(scanner.nextLine());
        double packagesMaia = Double.parseDouble(scanner.nextLine());

//        •	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
//        •	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
//        •	цената на един пакет мая е с 80% по-ниска от цената на килограм захар

        double priceZahar = priceKGBrashno * 0.75;
        double priceEggs = priceKGBrashno * 1.1;
        double priceMaia = priceZahar * 0.2;

        double totalPriceBrashno = priceKGBrashno * KGBrashno;
        double totalPriceZahar = priceZahar * KGZahar;
        double totalPriceEggs = priceEggs * Eggs;
        double totalPriceMaia = priceMaia * packagesMaia;

        double result = totalPriceBrashno + totalPriceZahar + totalPriceEggs + totalPriceMaia;

        System.out.printf("%.2f", result);

    }
}
