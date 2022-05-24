import java.util.Scanner;

public class E04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVeggies = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVeggies = Integer.parseInt(scanner.nextLine());
        int kgFriuts = Integer.parseInt(scanner.nextLine());

        double totalPrice = priceVeggies * kgVeggies + priceFruits * kgFriuts;

        double totalPriceEuro = totalPrice / 1.94;

        System.out.printf("%.2f", totalPriceEuro);


    }
}
