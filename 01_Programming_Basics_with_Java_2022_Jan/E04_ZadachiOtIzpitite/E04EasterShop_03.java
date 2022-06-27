import java.util.Scanner;

public class E04EasterShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());

        int soldEggs = 0;

        String input = scanner.nextLine();

        while (!input.equals("Close")) {
            int number = Integer.parseInt(scanner.nextLine());
            if (input.equals("Buy")) {
                if (number <= initialEggs) {
                    initialEggs = initialEggs - number;
                    soldEggs = soldEggs + number;
                } else {
                    break;
                }
            }
            if (input.equals("Fill")) {
                initialEggs = initialEggs + number;
            }
            input = scanner.nextLine();
        }

        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", initialEggs);
        }
    }
}
