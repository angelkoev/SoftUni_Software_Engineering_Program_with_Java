import java.util.Scanner;

public class E08OnTimeForTheExam_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int result = 0;
        int hours = 0;
        int minutes = 0;

        int startingTime = hoursExam * 60 + minutesExam;
        int arrivalTime = hourArrival * 60 + minutesArrival;

        int diff = Math.abs(startingTime - arrivalTime);

        if (arrivalTime > startingTime) {
            System.out.println("Late");
            if (diff >= 60) {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d minutes after the start", minutes);
            }
        } else if (arrivalTime == startingTime || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d minutes before the start", minutes);
            }

        } else if (arrivalTime < startingTime && diff > 30) {
            System.out.println("Early");;
            if (diff >= 60) {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.printf("%d minutes before the start", minutes);
            }
        }
    }
}
