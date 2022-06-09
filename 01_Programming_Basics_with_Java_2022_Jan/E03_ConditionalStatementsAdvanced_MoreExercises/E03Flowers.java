import java.util.Scanner;

public class E03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemum = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceChrysanthemum = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        int totalFlowers = countChrysanthemum + countRoses + countTulips;

        if (season.equals("Spring") || season.equals("Summer")) {
            priceChrysanthemum = 2;
            priceRoses = 4.1;
            priceTulips = 2.5;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            priceChrysanthemum = 3.75;
            priceRoses = 4.5;
            priceTulips = 4.15;
        }

        double priceDiscount = countChrysanthemum * priceChrysanthemum + countRoses * priceRoses + countTulips * priceTulips;

        if (holiday.equals("Y")) {
            priceDiscount = priceDiscount * 1.15;
        }

        if (countTulips > 7 && season.equals("Spring")) {
            priceDiscount = priceDiscount * 0.95;
        }
        if (countRoses >= 10 && season.equals("Winter")) {
            priceDiscount = priceDiscount * 0.9;
        }
        if (totalFlowers > 20) {
            priceDiscount = priceDiscount * 0.8;
        }

        System.out.printf("%.2f", priceDiscount+2);

    }
}
