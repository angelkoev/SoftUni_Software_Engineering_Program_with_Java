import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;

public class E04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        int points1 = 0;
        int points2 = 0;

        boolean endOfGame = false;

        String card1 = "";
        String card2 = "";


        while (!card1.equals("End of game")) {

            card1 = scanner.nextLine();
            if (card1.equals("End of game")) {
                endOfGame = true;
                break;
            }
            card2 = scanner.nextLine();

            int hand1 = Integer.parseInt(card1);
            int hand2 = Integer.parseInt(card2);



            if (hand1 > hand2) {
                points1 = points1 + hand1 - hand2;
            } else if (hand1 < hand2) {
                points2 = points2 + hand2 - hand1;
            } else if (hand1 == hand2) {
                System.out.println("Number wars!");
                hand1 = Integer.parseInt(scanner.nextLine());
                hand2 = Integer.parseInt(scanner.nextLine());

                if (hand1 > hand2) {
                    System.out.printf("%s is winner with %d points", name1, points1);
                } else {
                    System.out.printf("%s is winner with %d points", name2, points2);
                }

                break;
            }


        }

        if (endOfGame) {
            System.out.printf("%s has %d points%n", name1, points1);
            System.out.printf("%s has %d points", name2, points2);
        }


    }
}
