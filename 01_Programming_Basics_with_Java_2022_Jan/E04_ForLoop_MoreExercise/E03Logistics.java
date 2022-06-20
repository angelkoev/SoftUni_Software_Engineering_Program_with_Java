import java.util.Scanner;

public class E03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLoads = Integer.parseInt(scanner.nextLine());


        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        double totalKg = 0;
        double totalPrice = 0;

        for (int i = 1; i <= countLoads; i++) {
            double kgLoad = Double.parseDouble(scanner.nextLine());
            if (kgLoad <= 3) {
                p1 = p1 + kgLoad;
                totalKg = totalKg + kgLoad;
            } else if (kgLoad <= 11) {
                p2 = p2 + kgLoad;
                totalKg = totalKg + kgLoad;
            } else {
                p3 = p3 + kgLoad;
                totalKg = totalKg + kgLoad;
            }

        }

        totalPrice = p1 * 200 + p2 * 175 + p3 * 120;
        double totalPricePerKg =  totalPrice/totalKg;

//        System.out.println(totalKg);
        System.out.printf("%.2f%n",totalPricePerKg);
        System.out.printf("%.2f%%%n",p1/totalKg*100);
        System.out.printf("%.2f%%%n",p2/totalKg*100);
        System.out.printf("%.2f%%%n",p3/totalKg*100);

    }
}
