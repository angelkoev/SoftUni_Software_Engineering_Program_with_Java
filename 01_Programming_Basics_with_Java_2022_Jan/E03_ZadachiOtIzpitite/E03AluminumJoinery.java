import java.util.Scanner;

public class E03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (type.equals("90X130")) {
            price = 110;
            if (quantity > 30 && quantity < 60) {
                price *= 0.95;
            } else if (quantity >= 60) {
                price *= 0.92;
            }
        } else if (type.equals("100X150")) {
            price = 140;
            if (quantity > 40 && quantity < 80) {
                price *= 0.94;
            } else if (quantity >= 80) {
                price *= 0.90;
            }
        } else if (type.equals("130X180")) {
            price = 190;
            if (quantity > 20 && quantity < 50) {
                price *= 0.93;
            } else if (quantity >= 50) {
                price *= 0.88;
            }
        } else if (type.equals("200X300")) {
            price = 250;
            if (quantity > 25 && quantity < 50) {
                price *= 0.91;
            } else if (quantity >= 50) {
                price *= 0.86;
            }
        }

        double totalPrice = quantity * price;

        if (delivery.equals("With delivery")){
            totalPrice = totalPrice + 60;
        }

        if (quantity > 99) {
            totalPrice *= 0.96;
        }

        if (quantity < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalPrice);
        }

    }
}
