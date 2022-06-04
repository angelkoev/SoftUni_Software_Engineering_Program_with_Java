import java.util.Scanner;

public class E06NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nunber = Integer.parseInt(scanner.nextLine());

        if (nunber >= -100 && nunber <= 100 && nunber != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
