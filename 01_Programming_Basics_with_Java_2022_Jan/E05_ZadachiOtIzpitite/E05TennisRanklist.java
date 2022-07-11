import java.util.Scanner;

public class E05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int finalPoints = 0;
        int wonPoints = 0;
        int win = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    wonPoints += 2000;
                    win++;
                    break;
                case "F":
                    wonPoints += 1200;
                    break;
                case "SF":
                    wonPoints += 720;
                    break;

            }

        }
        int averagePoints = wonPoints / countTournaments;
        finalPoints = initialPoints + wonPoints;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", win * 1.0 / countTournaments * 100);

    }
}
