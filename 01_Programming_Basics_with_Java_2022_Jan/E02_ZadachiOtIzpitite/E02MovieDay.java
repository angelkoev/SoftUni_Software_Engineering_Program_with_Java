import java.util.Scanner;

public class E02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForShooting = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int timePerScene = Integer.parseInt(scanner.nextLine());

        double preparationTime = timeForShooting * 0.15;
        int timeForShootingScenes = scenes * timePerScene;
        double totalTimeNeeded = preparationTime + timeForShootingScenes;

        double diff = Math.abs(totalTimeNeeded - timeForShooting);

        if (timeForShooting >= totalTimeNeeded) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", diff);

        }

    }
}
