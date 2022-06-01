import java.util.Scanner;

public class E05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());
        int numberOfWorkersOvertime = Integer.parseInt(scanner.nextLine());

        double workingHours = workingDays * 0.9 * 8;
        int hoursOvertime = numberOfWorkersOvertime * 2 * workingDays;

        double totalWorkingHours = Math.floor(workingHours + hoursOvertime);

        double diff = Math.abs(totalWorkingHours - neededHours);

        if (totalWorkingHours >= neededHours) {
            System.out.printf("Yes!%.0f hours left.", diff);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", diff);
        }


    }
}
