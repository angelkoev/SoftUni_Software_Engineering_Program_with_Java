import java.util.Scanner;

public class E05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classPlace = "";
        String placeType = "";
        double priceAlaska = 0;
        double priceMarocco = 0;

        if (season.equals("Summer")) {
            placeType = "Alaska";
        } else if (season.equals("Winter")) {
            placeType = "Morocco";
        }

        if (budget <= 1000) {
            classPlace = "Camp";
            priceAlaska = budget * 0.65;
            priceMarocco = budget * 0.45;
        } else if (budget > 1000 && budget <= 3000) {
            classPlace = "Hut";
            priceAlaska = budget * 0.80;
            priceMarocco = budget * 0.6;
        } else if (budget > 3000) {
            classPlace = "Hotel";
            priceAlaska = budget * 0.9;
            priceMarocco = budget * 0.9;
        }


        double priceVacation = 0;

        if (placeType.equals("Alaska")) {
            priceVacation = priceAlaska;
        } else if (placeType.equals("Morocco")){
            priceVacation = priceMarocco;
        }

        System.out.printf("%s - %s - %.2f", placeType, classPlace, priceVacation);


    }
}
