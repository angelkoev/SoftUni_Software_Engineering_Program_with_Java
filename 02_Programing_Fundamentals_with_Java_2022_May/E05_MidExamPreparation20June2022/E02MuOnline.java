package E05_MidExamPreparation20June2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://judge.softuni.org/Contests/Practice/Index/2028#1
public class E02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        int bestRoom = 0;

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = 0; i < rooms.size(); i++) {
            bestRoom++;
            String[] data = rooms.get(i).split(" ");
            String type = data[0];
            int value = Integer.parseInt(data[1]);

            if (type.equals("potion")) {
                if (health + value >= 100) {
                    value = 100 - health;
                    health += value;
                } else {
                    health += value;
                }
                System.out.printf("You healed for %d hp.%n", value);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (type.equals("chest")) {
                System.out.printf("You found %d bitcoins.%n", value);
                bitcoins += value;
            } else {
                if (health - value > 0) {
                    health -= value;
                    System.out.printf("You slayed %s.%n", type);
                } else {
//                    if (health - value <= 0) {  // от отделна проверка го сложих в if-else и мина 2рия тест, който иначе не минаваше
                        health -= value;
                        System.out.printf("You died! Killed by %s.%n", type);
                        System.out.printf("Best room: %d%n", bestRoom);
                        break;
//                    }
                }
            }

        }

        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }

    }
}
