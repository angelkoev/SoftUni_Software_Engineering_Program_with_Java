import java.util.Scanner;

public class E07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countGPU = Integer.parseInt(scanner.nextLine());
        int countCPU = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());


//        •	Видеокарта – 250 лв./бр.
//        •	Процесор – 35% от цената на закупените видеокарти/бр.
//        •	Рам памет – 10% от цената на закупените видеокарти/бр.

        double priceGPU = countGPU * 250.0;
        double priceCPU = countCPU * priceGPU * 0.35;
        double priceRAM = countRAM * priceGPU * 0.1;

        double totalPrice = priceGPU + priceCPU + priceRAM;

        if (countGPU > countCPU) {
            totalPrice = totalPrice * 0.85;
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
