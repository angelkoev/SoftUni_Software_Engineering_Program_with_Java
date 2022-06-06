import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String country = "";
        String place = "";

        if (budget <= 100) {
            country = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
            } else if (season.equals("winter")) {
                price = budget * 0.7;
            }
        } else if (budget <= 1000) {
            country = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
            } else if (season.equals("winter")) {
                price = budget * 0.8;
            }
        } else if (budget > 1000) {
            country = "Europe";
                price = budget * 0.9;
            }


        if (country.equals("Europe")){
            place = "Hotel";
        } else if ((country.equals("Bulgaria") || country.equals("Balkans")) && season.equals("summer")) {
            place = "Camp";
        } else if ((country.equals("Bulgaria") || country.equals("Balkans")) && season.equals("winter")) {
            place = "Hotel";
        }


        System.out.printf("Somewhere in %s%n", country);
        System.out.printf("%s - %.2f",place, price);


        }
}
