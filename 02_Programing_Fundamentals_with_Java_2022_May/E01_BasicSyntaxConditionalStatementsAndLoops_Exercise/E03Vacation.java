package E01_BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.8;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.9;
                        break;
                    case "Saturday":
                        price = 15.6;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                break;
        }
        double totalPrice = 0;

        if ("Students".equals(type) && count >= 30) {
            totalPrice = price * count * 0.85;
        } else if ("Business".equals(type) && count >= 100) {
            totalPrice = price * (count - 10);
        } else if ("Regular".equals(type) && count >= 10 && count <= 20) {
            totalPrice = price * count * 0.95;
        } else {
            totalPrice = price * count;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
