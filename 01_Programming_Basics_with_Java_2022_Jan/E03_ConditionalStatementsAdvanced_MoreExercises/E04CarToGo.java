import java.util.Scanner;

public class E04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classCar = "";
        String carType = "";
        double priceCabrio = 0;
        double priceJeep = 0;

        if (season.equals("Summer")) {
            carType = "Cabrio";
        } else if (season.equals("Winter")) {
            carType = "Jeep";
        }

        if (budget <= 100) {
            classCar = "Economy class";
            priceCabrio = budget * 0.35;
            priceJeep = budget * 0.65;
        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            priceCabrio = budget * 0.45;
            priceJeep = budget * 0.8;
        } else if (budget > 500) {
            classCar = "Luxury class";
            priceCabrio = budget * 0.9;
            priceJeep = budget * 0.9;
        }

        if (budget > 500) {
            carType = "Jeep";
        }

        double priceCar = 0;

        if (carType.equals("Cabrio")) {
            priceCar = priceCabrio;
        } else if (carType.equals("Jeep")){
            priceCar = priceJeep;
        }

        System.out.printf("%s%n", classCar);
        System.out.printf("%s - %.2f", carType, priceCar);


    }
}
