import java.util.Scanner;

public class E09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size = Double.parseDouble(scanner.nextLine());
        double price = size * 7.61;
        double discountedPrice = price * (1-0.18);
        System.out.println("The final price is: " + discountedPrice + " lv.");
        System.out.println("the discount is: " + price * 0.18 + " lv.");
    }
}
