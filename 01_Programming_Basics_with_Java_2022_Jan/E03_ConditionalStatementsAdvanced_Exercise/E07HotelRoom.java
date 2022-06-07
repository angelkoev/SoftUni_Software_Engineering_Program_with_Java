import java.util.Scanner;

public class E07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                break;
            case "June":
            case "September":
                priceStudio = 75.2;
                priceApartment = 68.7;
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }

        if (days > 14) {
            priceApartment = priceApartment * 0.9;
            if (month.equals("June") || month.equals("September")) {
                priceStudio = priceStudio * 0.8;
            } else if (month.equals("May") || month.equals("October")) {
                priceStudio = priceStudio * 0.7;
            }
        } else if (days > 7 && (month.equals("May") || month.equals("October"))) {
            priceStudio = priceStudio * 0.95;
        }

        double totalPriceStudio = days * priceStudio;
        double totalPriceApartment = days * priceApartment;

        System.out.printf("Apartment: %.2f lv.%n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
