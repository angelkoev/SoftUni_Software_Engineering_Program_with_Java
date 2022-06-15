import java.util.Scanner;

public class E03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String typePackage = scanner.nextLine();
        String vip = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        double totalPrice = 0;
        boolean cityIsTrue = false;
        boolean typeIsTrue = false;

        if (city.equals("Bansko") || city.equals("Borovets")) {
            if (typePackage.equals("noEquipment")) {
                price = 80;
                discount = 5;
                cityIsTrue = true;
                typeIsTrue = true;
            } else if (typePackage.equals("withEquipment")) {
                price = 100;
                discount = 10;
                cityIsTrue = true;
                typeIsTrue = true;
            }
        } else if (city.equals("Varna") || city.equals("Burgas")) {
            if (typePackage.equals("noBreakfast")) {
                price = 100;
                discount = 7;
                cityIsTrue = true;
                typeIsTrue = true;
            } else if (typePackage.equals("withBreakfast")) {
                price = 130;
                discount = 12;
                cityIsTrue = true;
                typeIsTrue = true;
            }
        }
        if (nights >= 7) {
            nights = nights - 1;
        }

        totalPrice = price * nights;

        if (vip.equals("yes")) {
            totalPrice = totalPrice * ((100 - discount) / 100);
        }


        if (nights <= 0) {
            System.out.println("Days must be positive number!");
        } else if (cityIsTrue && typeIsTrue) {
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        } else {
            System.out.println("Invalid input!");
        }


    }
}


