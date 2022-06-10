import java.util.Scanner;

public class E08PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean inside = x > x1 && x < x2 && y > y1 && y < y2;
        boolean xCheck = (x == x1 || x == x2) && y >= y1 && y <= y2;
        boolean yCheck = (y == y1 || y == y2) && x >= x1 && x <= x2;


        if (xCheck || yCheck) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

    }
}
