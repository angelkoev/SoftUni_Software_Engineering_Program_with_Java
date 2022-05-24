import java.util.Scanner;

public class E01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double priceKids = priceAdult * 0.3;

        double totalPriceAdultTicket = priceAdult + serviceTax;
//        System.out.println(totalPriceAdultTicket);
        double totalPriceKidTicket = priceKids + serviceTax;
//        System.out.println(totalPriceKidTicket);

        double totalPriceTickets = totalPriceAdultTicket * adultTickets + totalPriceKidTicket * kidTickets;
//        System.out.println(totalPriceTickets);

        double profitForAgency = totalPriceTickets * 0.2 ;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profitForAgency);



    }
}
