import java.util.Scanner;

public class E09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = width * depth * height;
//        double liters = volume / 1000;   //      double liters = volume * 0.001;
        double liters = volume * 0.001; // double liters = volume / 1000;
        double space = percent / 100;

        double result = liters * (1 - space);

        System.out.println(result);

    }
}
