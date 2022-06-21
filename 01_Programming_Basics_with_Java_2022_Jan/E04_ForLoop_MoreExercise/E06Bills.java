import java.util.Scanner;

public class E06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMonths = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        double totalElectricity = 0;
        double water = 0;
        double internet = 0;
        double other = 0;
        double average = 0;

        for (int i = 1; i <= countMonths; i++) {
            double monthElectricity = Double.parseDouble(scanner.nextLine());
            totalElectricity = totalElectricity + monthElectricity;
            water = water + 20;
            internet = internet + 15;
            other = other + (monthElectricity + 20 + 15) * 1.2;
        }

        totalPrice = totalElectricity + water + internet + other;
        average = totalPrice / countMonths;

        System.out.printf("Electricity: %.2f lv", totalElectricity);
        System.out.println();
        System.out.printf("Water: %.2f lv", water);
        System.out.println();
        System.out.printf("Internet: %.2f lv", internet);
        System.out.println();
        System.out.printf("Other: %.2f lv" , other);
        System.out.println();
        System.out.printf("Average: %.2f lv", average);


    }
}
