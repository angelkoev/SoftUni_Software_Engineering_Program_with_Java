import java.util.Scanner;

public class E01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

//        if (type.equals("Premiere")) {
//            price = 12;
//        } else if (type.equals("Normal")) {
//            price = 7.5;
//        } else if (type.equals("Discount")) {
//            price = 5;
//        }

//   drugo reshenie, koeto napravo smiata i pechata sled proverkata
//        if (type.equals("Premiere")) {
//            double totalPrice = rows * columns * 12;
//            System.out.printf("%.2f leva", totalPrice);
//        } else if (type.equals("Normal")) {
//            double totalPrice = rows * columns * 7.5;
//            System.out.printf("%.2f leva", totalPrice);
//        } else if (type.equals("Discount")) {
//            double totalPrice = rows * columns * 5;
//            System.out.printf("%.2f leva", totalPrice);
//        }

        switch (type) {
            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
        }

        double totalPrice = price * rows * columns;
        System.out.printf("%.2f leva", totalPrice);


    }
}
