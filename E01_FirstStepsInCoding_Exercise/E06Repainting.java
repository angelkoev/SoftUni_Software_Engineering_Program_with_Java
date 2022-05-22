import java.util.Scanner;

public class E06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintQuantity = Integer.parseInt(scanner.nextLine());
        int razrQuantitity = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

//            Предпазен найлон - 1.50 лв. за кв. метър
//            Боя - 14.50 лв. за литър
//            Разредител за боя - 5.00 лв. за литър

        double priceAllNylon = (nylonQuantity + 2) * 1.50;
        double priceAllPaint = (paintQuantity * 1.10) * 14.50;
        double priceAllRazr = razrQuantitity * 5.00;

        double allSupplies = priceAllNylon + priceAllPaint + priceAllRazr + 0.40;

        double workerSum =( allSupplies * 0.30) * hours;

        double result = allSupplies + workerSum;


        System.out.println(result);
    }
}
