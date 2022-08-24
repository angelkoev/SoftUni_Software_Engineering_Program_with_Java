package E01_BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class E11RageExpenses_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0.0;

        int headsetCount = lostGameCount / 2;
        int mouseCount = lostGameCount / 3;
        int keyboardCount = lostGameCount / 6;
        int displayCount = lostGameCount / 12;

        double headset = headsetCount * headsetPrice;
        double mouse = mouseCount * mousePrice;
        double keyboard = keyboardCount * keyboardPrice;
        double display = displayCount * displayPrice;

        expenses = headset + mouse + keyboard + display;

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }

}
