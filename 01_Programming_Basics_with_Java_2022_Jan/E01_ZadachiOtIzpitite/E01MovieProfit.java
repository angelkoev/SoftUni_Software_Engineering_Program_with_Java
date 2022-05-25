import java.util.Scanner;

public class E01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double dayRevenue = tickets * priceTicket;
        double totalRevenue = days * dayRevenue;
//        System.out.println(totalRevenue);
        double cinemaTax = totalRevenue * percent / 100;
//        System.out.println(cinemaTax);
        double result = totalRevenue - cinemaTax;
//        System.out.println(result);

        System.out.printf("The profit from the movie %s is %.2f lv.",name,result);


    }
}
