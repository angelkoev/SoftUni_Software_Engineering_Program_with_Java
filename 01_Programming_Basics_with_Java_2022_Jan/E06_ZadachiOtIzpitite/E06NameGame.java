import java.util.Scanner;

public class E06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count1 = 0;
        int count2 = 0;
        int winnerPoints = Integer.MIN_VALUE;
        String winnerName = "";

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            int score = 0;

            for (int i = 0; i < input.length(); i++) {
                int digit = Integer.parseInt(scanner.nextLine());
                int letter = input.charAt(i);

                if (digit == letter) {
                    score += 10;
                } else {
                    score += 2;
                }
            }

            if (score >= winnerPoints) {
                winnerPoints = score;
                winnerName = input;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!",winnerName, winnerPoints);
    }
}
