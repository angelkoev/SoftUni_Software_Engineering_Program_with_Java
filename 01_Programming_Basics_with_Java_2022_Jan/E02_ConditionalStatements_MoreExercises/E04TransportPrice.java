import java.util.Scanner;

public class E04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String DayOrNight = scanner.nextLine();

        if (km >= 100) {
            System.out.printf("%.2f", km * 0.06);
        } else if (km >= 20) {
            System.out.printf("%.2f", km * 0.09);
        } else if (DayOrNight.equals("day")) {
            System.out.printf("%.2f", km * 0.79 + 0.7);
        } else {
            System.out.printf("%.2f", km * 0.9 + 0.7);
        }



    }
}
