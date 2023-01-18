package E05_MidExamRetake05;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2028#1
public class E02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int initHealth = 100;
        int bitcoins = 0;
        int bestRoom = 0;

        for (int i = 0; i < rooms.length; i++) {
            String[] input = rooms[i].split("\\s+");
            String command = input[0];
            int value = Integer.parseInt(input[1]);

            switch (command) {
                case "potion":
                    bestRoom++;
                    int tempHealth = initHealth; // трябва да отпечатам само разликата до 100 при heal-ването.
                    initHealth += value;
                      if (initHealth > 100) {
                        initHealth = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", initHealth - tempHealth);
                    System.out.printf("Current health: %d hp.%n", initHealth);
                    break;
                case "chest":
                    bestRoom++;
                    bitcoins += value;
                    System.out.printf("You found %d bitcoins.%n", value);
                    break;
                default:
                    bestRoom++;
                    initHealth -= value;
                    if (initHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", bestRoom);
                        return;
                    }
                    break;
            }

        }

        if (initHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", initHealth);
        }

    }
}
