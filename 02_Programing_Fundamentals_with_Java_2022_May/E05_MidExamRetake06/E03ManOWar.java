package E05_MidExamRetake06;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/1773#2
public class E03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int[] warship = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int maxHealthSection = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")) {
            String[] command = input.split(" ");
            String action = command[0];

            switch (action) {
                case "Fire":
                    int index = Integer.parseInt(command[1]);
                    int damage = Integer.parseInt(command[2]);

                    if (isIndexValid(warship, index)) {
//                    if (index >= 0 && index < warship.length) { // а може и да е с pirateShip... може да е объркано.
                        warship[index] -= damage;
                        if (warship[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    damage = Integer.parseInt(command[3]);
                    if (isIndexValid(pirateShip, startIndex) && isIndexValid(pirateShip, endIndex)) {
//                    if (startIndex >= 0 && startIndex < pirateShip.length && endIndex >= startIndex && endIndex < pirateShip.length && damage >= 0) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip[i] -= damage;
                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    index = Integer.parseInt(command[1]);
                    int health = Integer.parseInt(command[2]);

                    if (isIndexValid(pirateShip, index)) {
//                    if (index >= 0 && index < pirateShip.length) {
                        pirateShip[index] += health;
                        if (pirateShip[index] > maxHealthSection) {   //тази проверка беше извън другата и даваше грешка на 5ти тест !!!
                            pirateShip[index] = maxHealthSection;    // явно тест 5 изпозлва точно този index, който е невалиден
                        }                                            // и като вътрешната проверка е отвън, не се проверява отново индекса
                    }                                                // и тогава програмата гърми !!!
                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.length; i++) {
                        if (pirateShip[i] < maxHealthSection * 0.2) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }

            input = scanner.nextLine();
        }

        int pirateStatus = 0;
        int warshipStatus = 0;

        for (int i = 0; i < pirateShip.length; i++) {
            pirateStatus += pirateShip[i];
        }
        for (int i = 0; i < warship.length; i++) {
            warshipStatus += warship[i];
        }

        System.out.printf("Pirate ship status: %d%n", pirateStatus);
        System.out.printf("Warship status: %d", warshipStatus);

    }

    public static boolean isIndexValid(int[] array, int index) {
        return index >= 0 && index < array.length;
    }
}
