import java.util.Scanner;

public class E05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double kgSugar = 0;
        double kgFlour = 0;
        int maxSugar = 0;
        int maxFlour = 0;

        for (int i = 1; i <= count; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            kgSugar += sugar;
            kgFlour += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }

        double packagesSugar = Math.ceil(kgSugar/950);
        double test = Math.ceil(kgSugar/950);
        double packagesFlour = Math.ceil(kgFlour/750);

        System.out.printf("Sugar: %.0f%n", packagesSugar);
        System.out.printf("Flour: %.0f%n", packagesFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);



    }
}
