import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        if (type.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double result = side * side;
            System.out.printf("%.3f", result);
        } else if (type.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double result = side1 * side2;
            System.out.printf("%.3f", result);
        } else if (type.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double result = Math.PI * r * r;
            System.out.printf(" %.3f", result);
        } else if (type.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double result = side * height / 2;
        System.out.printf("%.3f", result);
    }
}
}
