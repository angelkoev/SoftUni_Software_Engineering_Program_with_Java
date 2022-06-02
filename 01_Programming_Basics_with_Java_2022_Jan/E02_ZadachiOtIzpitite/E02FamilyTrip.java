import java.util.Scanner;

public class E02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExpense = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }

        double sleeplingExpense = nights * pricePerNight;
        double additionalExpense = budget * percentExpense / 100;



        double totalExpense = sleeplingExpense + additionalExpense;



        double diff = Math.abs(budget - totalExpense);

        if (budget >= totalExpense) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }


    }
}
