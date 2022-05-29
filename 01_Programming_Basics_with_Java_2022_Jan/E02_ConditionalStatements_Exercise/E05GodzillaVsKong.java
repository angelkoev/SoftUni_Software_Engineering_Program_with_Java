import java.util.Scanner;

public class E05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetMovie = Double.parseDouble(scanner.nextLine());
        int numPeople = Integer.parseInt(scanner.nextLine());
        double priceCostumes = Double.parseDouble(scanner.nextLine());

        double priceDecor = budgetMovie * 0.10;

        double totalPriceCostumes = numPeople * priceCostumes;

        if (numPeople > 150) {
            totalPriceCostumes = totalPriceCostumes * 0.90;
        }

        double totalPrice = totalPriceCostumes + priceDecor;
        double diff = Math.abs(budgetMovie - totalPrice);


        if (budgetMovie >= totalPrice) {  //тук бях пропуснал = и ми даваше само 80/100
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }


    }
}
