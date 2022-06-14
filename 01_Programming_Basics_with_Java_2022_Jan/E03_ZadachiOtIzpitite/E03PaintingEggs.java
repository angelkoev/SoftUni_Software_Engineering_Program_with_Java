import java.util.Scanner;

public class E03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double eggPrice = 0;

        if (color.equals("Red")) {
            switch (size) {
                case "Large":
                    eggPrice = 16;
                    break;
                case "Medium":
                    eggPrice = 13;
                    break;
                case "Small":
                    eggPrice = 9;
                    break;
            }
        } else if (color.equals("Green")) {
            switch (size) {
                case "Large":
                    eggPrice = 12;
                    break;
                case "Medium":
                    eggPrice = 9;
                    break;
                case "Small":
                    eggPrice = 8;
                    break;
            }
        } else if (color.equals("Yellow")) {
            switch (size) {
                case "Large":
                    eggPrice = 9;
                    break;
                case "Medium":
                    eggPrice = 7;
                    break;
                case "Small":
                    eggPrice = 5;
                    break;
            }
        }

        double totalPrice = eggPrice * quantity * 0.65;
        System.out.printf("%.2f leva.",totalPrice);

    }
}
