import java.util.Scanner;

public class E05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int numberJudges = Integer.parseInt(scanner.nextLine());
        double judgePoints = 0;
        double totalPoints = 0;

        for (int i = 1; i <= numberJudges; i++) {
            if (judgePoints < (1250.5 - initialPoints)) {
                String nameJudge = scanner.nextLine();
                double points = Double.parseDouble(scanner.nextLine());
                judgePoints = judgePoints + nameJudge.length() * points / 2;
            }
        }
        totalPoints = initialPoints + judgePoints;
        double diff = Math.abs(1250.5 - totalPoints);

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }


    }
}
