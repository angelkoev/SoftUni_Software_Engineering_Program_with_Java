import java.util.Scanner;

public class E06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCount = 0;
        int winCount = 0;
        int lostCount = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of tournaments")) {

            String tournamentName = input;

            int numberOfGames = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= numberOfGames; i++) {

                totalCount++;

                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());

                int diff = Math.abs(num1 - num2);

                if (num1 > num2) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, diff);
                    winCount++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, diff);
                    lostCount++;
                }

            }

            input = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n", winCount * 1.0 / totalCount * 100);
        System.out.printf("%.2f%% matches lost%n", lostCount * 1.0 / totalCount * 100);

    }
}
