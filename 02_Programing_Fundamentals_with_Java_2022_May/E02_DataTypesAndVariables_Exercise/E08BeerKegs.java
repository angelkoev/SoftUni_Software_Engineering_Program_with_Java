package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double biggestKegVolume = Double.MIN_VALUE;
        String biggestKeg = "";


        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;
            if (volume >= biggestKegVolume) {
                biggestKeg = model;
                biggestKegVolume = volume;
            }
        }

        System.out.println(biggestKeg);

    }
}
