import java.util.Scanner;

public class E08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        System.out.println( (dog * 2.5 + cat * 4) + " lv.");

    }
}
