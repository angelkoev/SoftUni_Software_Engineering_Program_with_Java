import java.util.Scanner;

public class E08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());
        String card = scanner.nextLine();

        double cardGas = liters * (0.93 - 0.08);
        double cardGasoline = liters * (2.22 - 0.18);
        double cardDiesel = liters * (2.33 - 0.12);

        if (type.equals("Gas")) {
            if (card.equals("Yes")) {
                if (liters > 25) {
                    System.out.printf("%.2f lv.", cardGas * 0.9);
                } else if (liters > 20) {
                    System.out.printf("%.2f lv.", cardGas * 0.92);
                } else {
                    System.out.printf("%.2f lv.", cardGas);

                }
            } else if (liters > 25) {
                System.out.printf("%.2f lv.", liters * 0.93 * 0.9);
            } else if (liters > 20) {
                System.out.printf("%.2f lv.", liters * 0.93 * 0.92);
            } else {
                System.out.printf("%.2f lv.", liters * 0.93);

            }
        } else if (type.equals("Gasoline")) {
            if (card.equals("Yes")) {
                if (liters > 25) {
                    System.out.printf("%.2f lv.", cardGasoline * 0.9);
                } else if (liters > 20) {
                    System.out.printf("%.2f lv.", cardGasoline * 0.92);
                } else {
                    System.out.printf("%.2f lv.", cardGasoline);

                }
            } else if (liters > 25) {
                System.out.printf("%.2f lv.", liters * 2.22 * 0.9);
            } else if (liters > 20) {
                System.out.printf("%.2f lv.", liters * 2.22 * 0.92);
            } else {
                System.out.printf("%.2f lv.", liters * 2.22);

            }
        } else if (type.equals("Diesel")) {
            if (card.equals("Yes")) {
                if (liters > 25) {
                    System.out.printf("%.2f lv.", cardDiesel * 0.9);
                } else if (liters > 20) {
                    System.out.printf("%.2f lv.", cardDiesel * 0.92);
                } else {
                    System.out.printf("%.2f lv.", cardDiesel);

                }
            } else if (liters > 25) {
                System.out.printf("%.2f lv.", liters * 2.33 * 0.9);
            } else if (liters > 20) {
                System.out.printf("%.2f lv.", liters * 2.33 * 0.92);
            } else {
                System.out.printf("%.2f lv.", liters * 2.33);

            }
        }

    }
}
