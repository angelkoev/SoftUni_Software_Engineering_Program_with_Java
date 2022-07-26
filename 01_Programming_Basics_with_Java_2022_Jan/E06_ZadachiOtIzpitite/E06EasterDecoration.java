import java.util.Scanner;

public class E06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfClients = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        int count = 0;
        double currnetSum = 0;

        for (int i = 1; i <= numberOfClients; i++) {


            String input = scanner.nextLine();

            count = 0;
            currnetSum = 0;

            while (!input.equals("Finish")) {

                String itemType = input;

                switch (itemType) {
                    case "basket":
                        currnetSum = currnetSum + 1.5;
                        break;
                    case "wreath":
                        currnetSum = currnetSum + 3.8;
                        break;
                    case "chocolate bunny":
                        currnetSum = currnetSum + 7;
                        break;
                }
                count++;

                input = scanner.nextLine();
            }


            if (count % 2 == 0) {
                currnetSum = currnetSum * 0.8;
            }

            totalSum = totalSum + currnetSum;

            System.out.printf("You purchased %d items for %.2f leva.%n", count, currnetSum);


        }

        System.out.printf("Average bill per client is: %.2f leva.", totalSum / numberOfClients);

    }
}
