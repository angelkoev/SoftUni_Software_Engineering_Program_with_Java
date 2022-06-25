import java.util.Scanner;

public class E04Darts_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int initialPoints = 301;

        String input = scanner.nextLine();

        int shotCount = 0;
        int badShotCount = 0;

        while (!input.equals("Retire")) {
            String type = input;
            int points = Integer.parseInt(scanner.nextLine());



            switch (type) {
                case "Single":
                    points = points;
                    break;
                case "Double":
                    points = points * 2;
                    break;
                case "Triple":
                    points = points * 3;
                    break;
            }
            if (points > initialPoints) {
                badShotCount++;
            }
            if (points <= initialPoints) {
                initialPoints = initialPoints - points;
                shotCount++;
            }
            if (initialPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", name, shotCount);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", name, badShotCount);
        }
    }
}
