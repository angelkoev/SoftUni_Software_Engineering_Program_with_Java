import java.util.Scanner;

public class E07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

//      •	Пилешко меню –  10.35 лв.
//      •	Меню с риба – 12.40 лв.
//      •	Вегетарианско меню  – 8.15 лв.

        double priceChicken = chicken * 10.35;
        double priceFish = fish * 12.40;
        double priceVegan = vegan * 8.15;
        double totalMenu = priceChicken + priceFish + priceVegan;
        double desert = totalMenu * 0.20;

        double result = priceChicken + priceFish + priceVegan + desert + 2.5;

        System.out.println(result);
    }
}

