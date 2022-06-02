import java.util.Scanner;

public class E02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double delayTime = Math.floor ( lenght / 50 );
        double totalDelay = delayTime * 30;

        double totalTime = lenght * timePerMeter + totalDelay;

        double diff = Math.abs(recordTime - totalTime);

        if (totalTime < recordTime) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }


    }
}
