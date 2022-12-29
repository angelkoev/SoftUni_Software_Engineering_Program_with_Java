package E05_MidExamRetake03;
import java.util.Scanner;

public class E01CounterStrike_Ignat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int wonBattleCount = 0;

        while (!command.equals("End of battle")) {

            int distance = Integer.parseInt(command);

            if (energy < distance) {

                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy"
                        , wonBattleCount, energy);

                return;

            } else {

                wonBattleCount++;

                energy -= distance;

                if (wonBattleCount % 3 == 0) {
                    energy += wonBattleCount;
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", wonBattleCount, energy);

    }
}
