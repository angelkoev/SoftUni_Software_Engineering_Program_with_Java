import java.util.Scanner;

public class E10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isPositive = true;

        while (isPositive) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input >= 0) {
                System.out.printf("Result: %.2f%n", input * 2);
            } else {
                System.out.println("Negative number!");
                isPositive = false;
            }

        }
    }
}
