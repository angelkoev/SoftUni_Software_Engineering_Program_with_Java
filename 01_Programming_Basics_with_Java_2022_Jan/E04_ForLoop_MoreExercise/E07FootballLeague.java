import java.util.Scanner;

public class E07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int countFans = Integer.parseInt(scanner.nextLine());

        int teamA = 0;
        int teamB = 0;
        int teamV = 0;
        int teamG = 0;


        for (int i = 1; i <= countFans; i++) {
            String team = scanner.nextLine();
            switch (team) {
                case "A":
                    teamA++;
                    break;
                case "B":
                    teamB++;
                    break;
                case "V":
                    teamV++;
                    break;
                case "G":
                    teamG++;
                    break;

            }
        }

        System.out.printf("%.2f%%", teamA * 1.0 / countFans * 100);
        System.out.println();
        System.out.printf("%.2f%%", teamB * 1.0 / countFans * 100);
        System.out.println();
        System.out.printf("%.2f%%", teamV * 1.0 / countFans * 100);
        System.out.println();
        System.out.printf("%.2f%%", teamG * 1.0 / countFans * 100);
        System.out.println();
        System.out.printf("%.2f%%", countFans * 1.0 / capacity * 100);


    }
}
