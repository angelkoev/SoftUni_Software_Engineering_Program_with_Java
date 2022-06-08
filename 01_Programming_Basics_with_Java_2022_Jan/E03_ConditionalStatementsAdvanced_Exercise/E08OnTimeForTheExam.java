import java.util.Scanner;

public class E08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinuutes = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minOfArrival = Integer.parseInt(scanner.nextLine());

        int examTime = (examHour * 60) + examMinuutes;
        int arrivalTime = (hourOfArrival * 60) + minOfArrival;

        int diff = Math.abs(examTime - arrivalTime);

        if (arrivalTime > examTime) {
            System.out.println("Late");  //durg if da proverim dali e zakusnal nad 1h
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            } else
            System.out.printf("%d minutes after the start", diff);
        } else if (arrivalTime == examTime || diff <= 30) {
            System.out.println("On time"); // oshte proverka dali e 0 ili ima razlika
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early"); // oshte edna proverka s kolko e podranil i s kolko
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else
                System.out.printf("%d minutes before the start", diff);
        }

    }
}
