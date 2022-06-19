import java.util.Scanner;

public class E06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int countJudges = Integer.parseInt(scanner.nextLine());

        double totalPoints = initialPoints;

        for (int i = 1; i <= countJudges ; i++) {
//            if (totalPoints < 1250.5) {
            String nameJudge = scanner.nextLine();
            double point = Double.parseDouble(scanner.nextLine());

//            дължината на името на оценяващия умножено по точките, които дава делено на две.
            double currentPointSum = (nameJudge.length() * point / 2);

            if (totalPoints <1250.5) {
                totalPoints = totalPoints + currentPointSum;
            }
//            totalPoints = totalPoints + currentPointSum;

        }
//        }

//        System.out.println(totalPoints);

        double diff = Math.abs(totalPoints - 1250.5);

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }

    }
}
