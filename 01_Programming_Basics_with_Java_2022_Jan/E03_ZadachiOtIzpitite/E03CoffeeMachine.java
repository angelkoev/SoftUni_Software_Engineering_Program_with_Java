import java.util.Scanner;

public class E03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String sugar = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (type.equals("Espresso")) {
            switch (sugar) {
                case "Without":
                    price = 0.9;
                    break;
                case "Normal":
                    price = 1;
                    break;
                case "Extra":
                    price = 1.2;
                    break;
            }
        } else if (type.equals("Cappuccino")) {
            switch (sugar) {
                case "Without":
                    price = 1;
                    break;
                case "Normal":
                    price = 1.2;
                    break;
                case "Extra":
                    price = 1.6;
                    break;
            }
        } else if (type.equals("Tea")) {
            switch (sugar) {
                case "Without":
                    price = 0.5;
                    break;
                case "Normal":
                    price = 0.6;
                    break;
                case "Extra":
                price = 0.7;
                    break;
            }
        }

        double totalPrice = price * quantity;

        if (sugar.equals("Without")) {
            totalPrice *= 0.65;
        }
        if (type.equals("Espresso") && quantity >= 5){
            totalPrice *= 0.75;
        }
        if (totalPrice > 15) {
            totalPrice *= 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", quantity,type,totalPrice);

    }
}
