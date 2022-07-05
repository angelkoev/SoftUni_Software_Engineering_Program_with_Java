import java.util.Scanner;

public class E01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDetergentBottles = Integer.parseInt(scanner.nextLine());
        int detergentml = countDetergentBottles * 750;

        int dishes = 0;
        int pots = 0;
        int countCycle = 0;
        int leftDetergent = detergentml;
        boolean noMoreDetergent = false;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            countCycle++;
            int number = Integer.parseInt(input);
            if (countCycle % 3 == 0) {
                pots = pots + number;
                leftDetergent = leftDetergent - number * 15;
                if (leftDetergent < 0) {
                    noMoreDetergent = true;
                    break;
                }
            } else {
                dishes = dishes + number;
                leftDetergent = leftDetergent - number * 5;
                if (leftDetergent < 0) {
                    noMoreDetergent = true;
                    break;
                }
            }

            input = scanner.nextLine();
        }

        if (noMoreDetergent) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(leftDetergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", leftDetergent);
        }


    }
}
