import java.util.Scanner;

public class AreaOfFigures_07_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
//        square, rectangle, circle или triangle

        double area = 0;

        double a = Double.parseDouble(scanner.nextLine());

        if (type.equals("square")) {
            area = a * a;

        } else if (type.equals("rectangle")) {
            double sideB = Double.parseDouble(scanner.nextLine());

            area = a * sideB;

        } else if (type.equals("circle")) {
            area = Math.PI * a * a;

        } else if (type.equals("triangle")) {

            double h = Double.parseDouble(scanner.nextLine());

            area = a * h / 2;
        }

        System.out.printf("%.3f", area);


    }
}
