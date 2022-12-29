package E05_MidExamRetake03;

import java.util.Scanner;

public class E01CounterStrike_Mitaka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enoughBattles = "End of battle";

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        int leftEnergy = initialEnergy;
        int wonBattles = 0;
        boolean lostBattle = false;
        String currentInput = scanner.nextLine();

        while (!currentInput.equals(enoughBattles)) {
            int enemyDistance = Integer.parseInt(currentInput);

            if (enemyDistance <= leftEnergy) {
                leftEnergy -= enemyDistance;
                wonBattles++;
            } else {
                lostBattle = true;
                break;
            }

            if (wonBattles % 3 == 0) {
                leftEnergy += wonBattles;
            }

            currentInput = scanner.nextLine();
        }

        if (lostBattle) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, leftEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, leftEnergy);
        }
    }
}