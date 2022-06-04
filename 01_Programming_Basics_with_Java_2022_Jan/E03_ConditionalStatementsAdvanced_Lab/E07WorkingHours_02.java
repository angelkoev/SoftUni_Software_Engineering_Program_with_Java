import java.util.Scanner;

public class E07WorkingHours_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (hour >=10 && hour < 18 && !dayOfWeek.endsWith("Sunday")) {
            System.out.println("open");
        } else System.out.println("closed");

    }
}
