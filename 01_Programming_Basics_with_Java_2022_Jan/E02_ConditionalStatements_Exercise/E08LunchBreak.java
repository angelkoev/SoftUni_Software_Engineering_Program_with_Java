import java.util.Scanner;

public class E08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int lunchBreakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = lunchBreakTime / 8.0;
        double restTime = lunchBreakTime / 4.0;

        double leftTime = lunchBreakTime - lunchTime - restTime; // zakruglianeto kum po-goliamo shte e pozle

        double diff = Math.abs (leftTime - episodeTime); // absiiutna stoinost za razliakta

        if (leftTime >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(diff));
        } else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(diff));


    }
}
