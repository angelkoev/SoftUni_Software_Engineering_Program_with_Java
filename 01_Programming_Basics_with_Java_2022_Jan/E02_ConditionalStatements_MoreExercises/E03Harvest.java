import java.util.Scanner;

public class E03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMeters = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int wineRequired = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapeTotal = squareMeters * grapePerSquareMeter;
        double grapeForWine = grapeTotal * 0.4;
        double wineLiters = grapeForWine / 2.5;

        double diff = Math.abs(wineLiters - wineRequired);

        if (wineLiters >= wineRequired) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineLiters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(diff/workers*1.0));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }


    }
}
