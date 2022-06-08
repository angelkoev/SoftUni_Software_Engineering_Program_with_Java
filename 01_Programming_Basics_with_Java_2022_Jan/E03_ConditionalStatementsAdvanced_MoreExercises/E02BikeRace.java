import java.util.Scanner;

public class E02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int senoirsCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double juniorsPrice = 0;
        double seniorsPrice = 0;

        if (type.equals("trail")) {
            juniorsPrice = 5.5;
            seniorsPrice = 7;
        } else if (type.equals("cross-country")) {
            juniorsPrice = 8;
            seniorsPrice = 9.5;
        } else if (type.equals("downhill")) {
            juniorsPrice = 12.25;
            seniorsPrice = 13.75;
        } else if (type.equals("road")) {
            juniorsPrice = 20;
            seniorsPrice = 21.5;
        }

        int totalPeople = juniorsCount + senoirsCount;
        double priceBeforeTaxes = juniorsCount * juniorsPrice + senoirsCount * seniorsPrice;

        if (type.equals("cross-country") && totalPeople >= 50) {
            priceBeforeTaxes = priceBeforeTaxes * 0.75;
        }

        double finalPrice = priceBeforeTaxes * 0.95;

        System.out.printf("%.2f",finalPrice);

    }
}
