import java.util.Scanner;

public class E08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = r * r * Math.PI;
        double perimeter = 2 * r * Math.PI;

        System.out.printf("%.2f %n",area);
        System.out.printf("%.2f",perimeter);


    }
}
