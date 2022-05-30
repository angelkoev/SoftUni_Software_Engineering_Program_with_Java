import java.util.Scanner;

public class E02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - freeDays;

        int totalPlayTime = workingDays * 63 + freeDays * 127;

        int diff = Math.abs(totalPlayTime - 30000);
        int hours = diff / 60;
        int minutes = diff % 60;

        if (totalPlayTime > 30000) {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);

        }

    }
}
