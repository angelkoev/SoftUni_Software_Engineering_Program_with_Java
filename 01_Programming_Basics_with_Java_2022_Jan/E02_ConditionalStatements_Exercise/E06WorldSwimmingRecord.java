import java.util.Scanner;

public class E06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double allTime = distance * timePerMeter;

        double addedTime = Math.floor(distance / 15) * 12.5;

        double totalTime = allTime + addedTime;

        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        } else
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime - worldRecord);


    }
}
