import java.util.Scanner;

public class E06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDays = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double dogFoodNeeded = Double.parseDouble(scanner.nextLine());
        double catFoodNeeded = Double.parseDouble(scanner.nextLine());
        double turtleFoodNeeded = Double.parseDouble(scanner.nextLine());

        double totalNeededFood = numberDays * (dogFoodNeeded + catFoodNeeded + turtleFoodNeeded/1000);

//        System.out.println(totalNeededFood);

        double diff = Math.abs(leftFood - totalNeededFood);

        if (leftFood >= totalNeededFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }

    }
}
