import java.util.Scanner;

public class E04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOne = Integer.parseInt(scanner.nextLine());
        int eggsTwo = Integer.parseInt(scanner.nextLine());
        boolean end = false;

        while (!end && eggsOne != 0 && eggsTwo != 0) {
            String command = scanner.nextLine();
            if (command.equals("End of battle")) {
                end = true;
            } else if (command.equals("one")) {
                eggsTwo--;
            } else if (command.equals("two")) {
                eggsOne--;
            }
        }

        if (eggsOne == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsTwo);
        }
        if (eggsTwo == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsOne);
        }
        if (end) {
            System.out.printf("Player one has %d eggs left.%n", eggsOne);
            System.out.printf("Player two has %d eggs left.", eggsTwo);

        }

    }
}

