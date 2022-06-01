import java.util.Scanner;

public class E07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Магнолии – 3.25 лева
//•	Зюмбюли – 4 лева
//•	Рози – 3.50 лева
//•	Кактуси – 8 лева

// От общата сума, Мария трябва да плати 5% данъци.

        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double priceMagnolii = magnolii * 3.25;
        double priceZumbuli = zumbuli * 4.0;
        double priceRoses = roses * 3.50;
        double priceCactuses = cactuses * 8.0;

        double totalPrice = (priceMagnolii + priceZumbuli + priceRoses + priceCactuses) * 0.95;

        double diff = Math.abs(totalPrice - presentPrice);

        if (totalPrice >= presentPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }




    }
}
