import java.util.Scanner;

public class E06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        boolean isWon = false;
        double totalMoney = 0;
        int win = 0;
        int lose = 0;
        int daysWon = 0;
        int daysLose = 0;


        for (int i = 1; i <= days; i++) {
            int currentSum = 0;
            String input = scanner.nextLine();
            win = 0;
            lose = 0;

            while (!input.equals("Finish")) {

                String result = scanner.nextLine();

                if (result.equals("win")) {
                    win++;
                    currentSum += 20;
                } else if (result.equals("lose")) {
                    lose++;
                }

                input = scanner.nextLine();
            }

            if (win > lose) {
                currentSum *= 1.1;
                daysWon++;
            } else {
                daysLose++;
            }

            totalMoney += currentSum;

        }

        if (daysWon > daysLose) {
            totalMoney *= 1.2;
            isWon = true;
        }

        if (isWon) {
            System.out.print("You won the tournament! ");
            System.out.printf("Total raised money: %.2f", totalMoney);
        } else {
            System.out.print("You lost the tournament! ");
            System.out.printf("Total raised money: %.2f", totalMoney);
        }


    }
}
