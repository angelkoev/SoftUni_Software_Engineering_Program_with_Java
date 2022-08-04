import java.util.Scanner;

public class E03FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        int expences = 0;

        if (season.equals("summer")) {
            if (place.equals("Bulgaria")) {
                expences = 5;
            } else if (place.equals("Abroad")) {
                expences = 10;
            }
        } else if (season.equals("winter")) {
            if (place.equals("Bulgaria")) {
                expences = 8;
            } else if (place.equals("Abroad")) {
                expences = 15;
            }
        }

        double sum = countDancers * points * (1 - expences * 1.0 / 100);

        if (place.equals("Abroad")) {
            sum = sum * 1.5;
        }

        double finalSum = sum * 0.25;
        double charitySum = sum * 0.75;

        System.out.printf("Charity - %.2f%n", charitySum);
        System.out.printf("Money per dancer - %.2f", finalSum / countDancers);


    }
}
