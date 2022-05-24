import java.util.Scanner;

public class E01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double lvFromBitcoin = bitcoin * 1168;
        double dollarFromYuan = yuan * 0.15;
        double lvFromDollar = dollarFromYuan * 1.76;

        double totalLeva = lvFromBitcoin + lvFromDollar;

        double euroFromLeva = totalLeva / 1.95;

        double tax = euroFromLeva * comission / 100 ;

        double result = euroFromLeva - tax;

        System.out.printf("%.2f", result);


    }
}
