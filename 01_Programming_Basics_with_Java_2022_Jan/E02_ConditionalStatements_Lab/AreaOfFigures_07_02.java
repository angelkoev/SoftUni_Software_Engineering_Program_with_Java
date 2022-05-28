import java.util.Scanner;

public class AreaOfFigures_07_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
//        square, rectangle, circle или triangle

        double area = 0;

        if (type.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());

            area = a * a;

        } else if (type.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            area = sideA * sideB;

        } else if (type.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());

            area = Math.PI * r * r;

        } else if (type.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = sideA * h / 2;
        }

        System.out.printf("%.3f", area);


    }
}
