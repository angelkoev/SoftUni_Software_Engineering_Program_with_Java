import java.util.Scanner;

public class E11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Thursday") || day.equals("Wednesday") || day.equals("Friday")) {
            switch (name) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    price = 0.0;
                    break;
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (name) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                default:
                    price = 0.0;
                    break;
            }
        }

         if (price == 0.0) {
            System.out.println("error");
        } else {
             double result = quantity * price;
             System.out.printf("%.2f", result);
         }



    }
}

