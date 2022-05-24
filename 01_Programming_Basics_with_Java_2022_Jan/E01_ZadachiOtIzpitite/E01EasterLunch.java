import java.util.Scanner;

public class E01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Козунак  – 3.20 лв.
//        •	Яйца –  4.35 лв. за кора с 12 яйца
//        •	Курабии – 5.40 лв. за килограм
//        •	Боя за яйца - 0.15 лв. за яйце

        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int kurabii = Integer.parseInt(scanner.nextLine());

        double priceKozunaci = kozunak * 3.2;
        double priceEggs = eggs * 4.35;
        double priceKurabii = kurabii * 5.4;
        double priceBoiaZaIaica = eggs * 12 * 0.15;

        double totalPrice = priceKozunaci + priceEggs + priceKurabii + priceBoiaZaIaica;
        System.out.printf("%.2f", totalPrice);

    }
}
