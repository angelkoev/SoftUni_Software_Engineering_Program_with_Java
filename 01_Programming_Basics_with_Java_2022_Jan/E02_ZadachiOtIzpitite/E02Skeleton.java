import java.util.Scanner;

public class E02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesControl = Integer.parseInt(scanner.nextLine());
        int secondsControl = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        int secPer100m = Integer.parseInt(scanner.nextLine());

        double controlTime = minutesControl * 60 + secondsControl;
        double timeLost = lenght / 120;
        double  totalTimeLost = timeLost * 2.5;

        double timeMartin = lenght / 100 * secPer100m - totalTimeLost;

        double diff = Math.abs(controlTime - timeMartin);


        if (timeMartin <= controlTime) {
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.", timeMartin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }

    }
}
