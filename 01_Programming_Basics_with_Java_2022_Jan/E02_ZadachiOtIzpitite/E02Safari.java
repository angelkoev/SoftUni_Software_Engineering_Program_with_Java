import java.util.Scanner;

public class E02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int fuel = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelExpense = fuel * 2.1;
        int guideExpense = 100;

        double totalExpense = fuelExpense + guideExpense;


        if (day.equals("Saturday")) {
            totalExpense = totalExpense * 0.9;
        } else if (day.equals("Sunday")) {
            totalExpense = totalExpense * 0.8;
        }

        double diff = Math.abs(totalExpense - budget);

        if (budget >= totalExpense) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }


    }
}
