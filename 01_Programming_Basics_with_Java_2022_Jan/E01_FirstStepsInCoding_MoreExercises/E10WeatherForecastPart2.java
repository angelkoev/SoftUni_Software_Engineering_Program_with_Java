import java.util.Scanner;

public class E10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp = Double.parseDouble(scanner.nextLine());

        if (temp > 35) {
            System.out.println("unknown");
        } else if (temp < 5) {
            System.out.println("unknown");
        } else if (temp >=26) {
            System.out.println("Hot");
        } else if (temp >=20.1) {
            System.out.println("Warm");
        } else if (temp >=15) {
            System.out.println("Mild");
        } else if (temp >=12) {
            System.out.println("Cool");
        } else if (temp >=5) {
            System.out.println("Cold");
        }
    }
}
