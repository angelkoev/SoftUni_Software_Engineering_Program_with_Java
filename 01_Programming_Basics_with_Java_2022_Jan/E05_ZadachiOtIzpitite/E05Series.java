import java.util.Scanner;

public class E05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (name) {
                case "Thrones":
                    price = price * 0.5;
                    break;
                case "Lucifer":
                    price = price * 0.6;
                    break;
                case "Protector":
                    price = price * 0.7;
                    break;
                case "TotalDrama":
                    price = price * 0.8;
                    break;
                case "Area":
                    price = price * 0.9;
                    break;
            }
            totalPrice = totalPrice + price;
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }

    }
}
