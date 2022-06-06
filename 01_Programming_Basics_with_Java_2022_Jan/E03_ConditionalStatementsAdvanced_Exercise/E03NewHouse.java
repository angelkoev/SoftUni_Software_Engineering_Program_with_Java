import java.util.Scanner;

public class E03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

//        Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"

        switch (typeFlower) {
            case "Roses":
                totalPrice = countFlowers * 5.0;
                if (countFlowers > 80) {
                    totalPrice = totalPrice * 0.9;
                }
                break;
            case "Dahlias":
                totalPrice = countFlowers * 3.8;
                if (countFlowers > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Tulips":
                totalPrice = countFlowers * 2.8;
                if (countFlowers > 80) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                totalPrice = countFlowers * 3.0;
                if (countFlowers < 120) {
                    totalPrice = totalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                totalPrice = countFlowers * 2.5;
                if (countFlowers < 80) {
                    totalPrice = totalPrice * 1.2;
                break;
        }
        }

        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }

    }
}
