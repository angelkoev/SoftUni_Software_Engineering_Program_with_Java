import java.util.Scanner;

public class E04EasterEggsBattle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs1 = Integer.parseInt(scanner.nextLine());
        int eggs2 = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {
            if (input.equals("one")) {
                eggs2--;
            }
            if (input.equals("two")) {
                eggs1--;
            }
            if (eggs1 <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggs2);
                break;
            }
            if (eggs2 <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggs1);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", eggs1);
            System.out.printf("Player two has %d eggs left.", eggs2);
        }

    }
}
