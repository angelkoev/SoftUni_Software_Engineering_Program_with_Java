import java.util.Scanner;

public class E04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
//        int black = 0;
        int other = 0;
        int totalPoints = 0;
        int divides = 0;

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5;
                    red++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orange++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellow++;
                    break;
                case "white":
                    totalPoints += 20;
                    white++;
                    break;
                case "black":
                    totalPoints = totalPoints / 2;
//                    black++;
                    divides++;
                    break;
                default:
                    other++;
                    break;
            }
        }

        System.out.printf("Total points: %d%n",totalPoints);
        System.out.printf("Red balls: %d%n",red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", other);
        System.out.printf("Divides from black balls: %d", divides);

    }
}
