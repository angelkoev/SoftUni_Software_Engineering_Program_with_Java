import java.util.Scanner;

public class E01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double episodeTime = time * 1.2;
        double specialTime = seasons * 10;

        double totalTime = seasons * episodes * episodeTime + specialTime;

        int result = (int) Math.floor (totalTime);

        System.out.printf("Total time needed to watch the %s series is %d minutes.", name, result);


    }
}
