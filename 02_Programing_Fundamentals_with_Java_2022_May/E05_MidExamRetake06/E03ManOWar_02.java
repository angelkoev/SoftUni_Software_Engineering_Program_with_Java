package E05_MidExamRetake06;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/1773#2
public class E03ManOWar_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt).toArray();
        int[] warShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt).toArray();

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Fire":
                    int index = Integer.parseInt(data[1]);
                    int damage = Integer.parseInt(data[2]);
                    if (isIndexValid(index, warShip.length)) {
                        warShip[index] = warShip[index] - damage;
                        if (warShip[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    int dmg = Integer.parseInt(data[3]);
                    if (isIndexValid(startIndex, pirateShip.length) && isIndexValid(endIndex, pirateShip.length)) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip[i] = pirateShip[i] - dmg;
                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(data[1]);
                    int health = Integer.parseInt(data[2]);
                    if (isIndexValid(repairIndex, pirateShip.length)) {
                        pirateShip[repairIndex] += health;
                        if (pirateShip[repairIndex] > maxHealth) {
                            pirateShip[repairIndex] = maxHealth;
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.length; i++) {
                        if (pirateShip[i] < 0.2 * maxHealth) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }

            input = scanner.nextLine();
        }

        int pirateSum = 0;
        int warShipSum = 0;
        for (int i = 0; i < pirateShip.length; i++) {
            pirateSum += pirateShip[i];
        }
        for (int i = 0; i < warShip.length; i++) {
            warShipSum += warShip[i];
        }

        System.out.printf("Pirate ship status: %d%n", pirateSum);
        System.out.printf("Warship status: %d%n", warShipSum);

    }

    public static boolean isIndexValid(int index, int size) {
        return index >= 0 && index < size;
    }
}
