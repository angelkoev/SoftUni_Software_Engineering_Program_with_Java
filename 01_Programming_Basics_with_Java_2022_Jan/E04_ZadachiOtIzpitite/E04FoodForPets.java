import java.util.Scanner;

public class E04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double initialFood = Double.parseDouble(scanner.nextLine());

        double totalEatenFood = 0;
        double totalDogFood = 0;
        double totalCatFood = 0;
        double totalBisquits = 0;

        for (int i = 1; i <= count; i++) {
            int dogEatedFood = Integer.parseInt(scanner.nextLine());
            int catEatedFood = Integer.parseInt(scanner.nextLine());

            totalEatenFood = totalEatenFood + dogEatedFood + catEatedFood;
            totalDogFood = totalDogFood + dogEatedFood;
            totalCatFood = totalCatFood + catEatedFood;

            if (i % 3 == 0) {
                totalBisquits = totalBisquits + 0.1 * (dogEatedFood + catEatedFood);
            }

        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalBisquits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFood / initialFood * 100.0);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogFood / totalEatenFood * 100.0);
        System.out.printf("%.2f%% eaten from the cat.", totalCatFood / totalEatenFood * 100.0);


    }
}
