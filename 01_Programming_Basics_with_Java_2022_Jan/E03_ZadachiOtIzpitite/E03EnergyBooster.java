import java.util.Scanner;

public class E03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flavour = scanner.nextLine();
        String size = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (flavour) {
            case "Watermelon": {
                if (size.equals("small")) {
                    price = 56 * 2;
                } else if (size.equals("big")) {
                    price = 28.7 * 5;
                }
            }
            break;
            case "Mango": {
                if (size.equals("small")) {
                    price = 36.66 * 2;
                } else if (size.equals("big")) {
                    price = 19.6 * 5;
                }
                break;
            }
            case "Pineapple": {
                if (size.equals("small")) {
                    price = 42.1 * 2;
                } else if (size.equals("big")) {
                    price = 24.8 * 5;
                }
                break;
            }
            case "Raspberry": {
                if (size.equals("small")) {
                    price = 20 * 2;
                } else if (size.equals("big")) {
                    price = 15.2 * 5;
                }
                break;
            }


        }
        double totalPrice = price * quantity;

        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice *= 0.85;
        } else if (totalPrice > 1000) {
            totalPrice *= 0.5;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
