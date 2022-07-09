import java.util.Scanner;

public class E05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        int win = 0;
        int draw = 0;
        int lose = 0;
        int points = 0;

        if (count == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            for (int i = 1; i <= count; i++) {
                String result = scanner.nextLine();
                if (result.equals("W")) {
                    win++;
                    points = points + 3;
                } else if (result.equals("D")) {
                    points = points + 1;
                    draw++;
                } else if (result.equals("L")) {
                    lose++;
                }

            }


            System.out.printf("%s has won %d points during this season.%n", name, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", lose);
            System.out.printf("Win rate: %.2f%%", win * 1.0 / count * 100);

        }
    }
}