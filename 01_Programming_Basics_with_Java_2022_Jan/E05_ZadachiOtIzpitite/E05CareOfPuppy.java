import java.util.Scanner;

public class E05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialFood = 1000 * Integer.parseInt(scanner.nextLine());

        String text = scanner.nextLine();


        while (!text.equals("Adopted")) {

           int eatedFood = Integer.parseInt(text);
            initialFood = initialFood - eatedFood;

            text = scanner.nextLine();

        }

        if (initialFood >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", initialFood);
        } else {
            System.out.printf("Food is not enough. You need %.0f grams more.", 1.0*Math.abs(initialFood));
        }


    }
}
