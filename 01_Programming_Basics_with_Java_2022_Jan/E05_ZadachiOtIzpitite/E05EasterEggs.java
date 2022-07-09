import java.util.Scanner;

public class E05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = 0;
        String maxEggs = "";

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }
        }

        if (red > orange && red > blue && red > green) {
            maxEggs = "red";
            max = red;
        } else if (orange > red && orange > blue && orange > green) {
            maxEggs = "orange";
            max = orange;
        } else if (blue > red && blue > orange && blue > green) {
            maxEggs = "blue";
            max = blue;
        } else if (green > red && green > orange && green > blue) {
            maxEggs = "green";
            max = green;
        }

        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", max, maxEggs);


    }
}
