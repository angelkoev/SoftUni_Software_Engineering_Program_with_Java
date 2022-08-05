import java.util.Scanner;

public class E04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0;
        double totalDegrees = 0;

        for (int i = 1; i <= days ; i++) {
            double dailyLiters = Double.parseDouble(scanner.nextLine());
            double dailyDegrees = Double.parseDouble(scanner.nextLine());

            totalLiters = totalLiters + dailyLiters;
            totalDegrees = totalDegrees + dailyLiters * dailyDegrees;

        }

        double averageDegrees = totalDegrees / totalLiters;

        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", averageDegrees);

        if (averageDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegrees <= 42) {
            System.out.println("Super!");
        } else if (averageDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        }

    }
}
