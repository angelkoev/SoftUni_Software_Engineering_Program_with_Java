import java.util.Scanner;

public class E02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double foodPerDayForDeer1 = Double.parseDouble(scanner.nextLine());
        double foodPerDayForDeer2 = Double.parseDouble(scanner.nextLine());
        double foodPerDayForDeer3 = Double.parseDouble(scanner.nextLine());

        double totalFoodNeeded = (foodPerDayForDeer1 + foodPerDayForDeer2 + foodPerDayForDeer3) * days;

        double diff = Math.abs(totalFoodNeeded - leftFood);

        if (totalFoodNeeded <= leftFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }


    }
}
