import java.util.Scanner;

public class E01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());;
        double tax = Double.parseDouble(scanner.nextLine());;
        double priceBed = Double.parseDouble(scanner.nextLine());;
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double totalTax = people * tax;
//        System.out.println(totalTax);
        double umbrella = Math.ceil(people * 0.5);
//        System.out.println( umbrella);
        double totalUmbrella = priceUmbrella * umbrella;
//        System.out.println(totalUmbrella);
        double bed = Math.ceil (people * 0.75);
        double totalBed = priceBed * bed;
//        System.out.println(totalBed);

        double result = totalTax + totalUmbrella + totalBed;

        System.out.printf("%.2f lv.", result);



    }
}
