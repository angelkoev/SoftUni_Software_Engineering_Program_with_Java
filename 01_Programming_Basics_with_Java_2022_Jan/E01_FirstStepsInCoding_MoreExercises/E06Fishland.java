import java.util.Scanner;

public class E06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumria = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

//        •	Паламуд – 60% по-скъп от скумрията
//        •	Сафрид – 80% по-скъп от цацата
//        •	Миди – 7.50 лв. за килограм

        double pricePalamud = priceSkumria * 1.6;
        double priceSafrid = priceCaca * 1.8;

        double totalPalamud = pricePalamud * kgPalamud;
        double totalSafrid = priceSafrid * kgSafrid;
        double totalMidi = 7.5 * kgMidi;

        double totalPrice = totalPalamud + totalSafrid + totalMidi;

        System.out.printf("%.2f", totalPrice);

    }
}
