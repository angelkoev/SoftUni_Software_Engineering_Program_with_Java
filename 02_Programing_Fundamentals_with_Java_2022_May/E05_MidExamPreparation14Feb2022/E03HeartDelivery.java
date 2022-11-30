package E05_MidExamPreparation14Feb2022;

import javax.imageio.IIOParam;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2031#2
public class E03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = nextIntArray(scanner, "@");
        int currentPosition = 0;


        String command = scanner.nextLine();

        while (!command.equals("Love!")) {

            String[] commandAndParamater = command.split(" ");
            int jump = Integer.parseInt(commandAndParamater[1]);
            currentPosition += jump;
            if (currentPosition >= houses.length) { //става и с метод isValidIndex
                currentPosition = 0; //иначе само при > houses.length даваше грешка при index 3, че такъв няма
            }

            if (houses[currentPosition] > 0) {
                houses[currentPosition] -= 2;
                if (houses[currentPosition] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            }



            command = scanner.nextLine();
        }

        int failed = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != 0) {
                failed++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        if (failed > 0) {
            System.out.printf("Cupid has failed %d places.%n", failed);
        } else {
            System.out.println("Mission was successful.");
        }


    }

    private static int[] nextIntArray(Scanner scanner, String separator) {
        String[] intsAsString = scanner.nextLine().split(separator);
        int[] array = new int[intsAsString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intsAsString[i]);
        }
        return array;
    }
}
