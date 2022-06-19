import java.util.Scanner;

public class E08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        double initialPoints = Double.parseDouble(scanner.nextLine());

        double points = 0;
        int countWins = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    points = points + 2000;
                    countWins++;
                    break;
                case "F":
                    points = points + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    break;
            }

        }
        double averagePoints = points / countTournaments;

        System.out.printf("Final points: %.0f%n", points + initialPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", countWins * 1.0 / countTournaments * 100);


    }
}
