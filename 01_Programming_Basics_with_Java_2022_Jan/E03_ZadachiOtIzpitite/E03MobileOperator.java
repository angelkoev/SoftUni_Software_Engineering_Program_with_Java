import java.util.Scanner;

public class E03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (time.equals("one")) {
            switch (type) {
                case "Small":
                    price = 9.98;
                    break;
                case "Middle":
                    price = 18.99;
                    break;
                case "Large":
                    price = 25.98;
                    break;
                case "ExtraLarge":
                    price = 35.99;
                    break;
            }
        } else if (time.equals("two")) {
            switch (type) {
                case "Small":
                    price = 8.58;
                    break;
                case "Middle":
                    price = 17.09;
                    break;
                case "Large":
                    price = 23.59;
                    break;
                case "ExtraLarge":
                    price = 31.79;
                    break;
            }
        }
            if (internet.equals("yes")) {
                if (price <= 10) {
                    price = price + 5.5;
                } else if (price <=30) {
                    price = price + 4.35;
                } else if (price > 30) {
                    price = price    + 3.85;
                }
            }

            double totalPrice = price * months;

            if (time.equals("two")) {
                totalPrice = totalPrice * 0.9625;
            }

            System.out.printf("%.2f lv.", totalPrice);


        }
}
