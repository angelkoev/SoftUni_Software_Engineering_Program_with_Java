package E05_MidExamRetake05;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2028#1
public class E02MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        int count = 0;

        String[] rooms = scanner.nextLine().split("\\|");


        for (int i = 0; i < rooms.length; i++) {
            String[] data = rooms[i].split(" ");
            String name = data[0];
            int value = Integer.parseInt(data[1]);

            count++;

            switch (name) {
                case "potion":
                    int diff = 100 - health;
                    if (diff < value) {
                        health += diff;
                        System.out.printf("You healed for %d hp.%n", diff);
                    } else {
                        health += value;
                        System.out.printf("You healed for %d hp.%n", value);
                    }
                    System.out.printf("Current health: %d hp.%n", health);

                    break;
                case "chest":
                    bitcoins += value;
                    System.out.printf("You found %d bitcoins.%n", value);
                    break;
                default:
                    if (health - value > 0) {
                        health -= value;
                        System.out.printf("You slayed %s.%n", name);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", name);
                        System.out.printf("Best room: %d", count);
                        return;
                    }


                    break;
            }

        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d%n", health);
    }
}
