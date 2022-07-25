import java.util.Scanner;

public class E06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakesCount = Integer.parseInt(scanner.nextLine());

        int maxPionts = Integer.MIN_VALUE;
        String nameMaxPoints = "";

        for (int i = 1; i <= easterCakesCount; i++) {

            int currentPoints = 0;
            String currentName = scanner.nextLine();

            String input = scanner.nextLine(); //тук бях объркал преди това

            while (!input.equals("Stop")) {

                int newPoints = Integer.parseInt(input);
                currentPoints = currentPoints + newPoints;

                input = scanner.nextLine();
            }


            System.out.printf("%s has %d points.%n", currentName, currentPoints);

            if (currentPoints > maxPionts) {
                maxPionts = currentPoints;
                nameMaxPoints = currentName;
                System.out.printf("%s is the new number 1!%n", currentName);
            }


        }

        System.out.printf("%s won competition with %d points!", nameMaxPoints, maxPionts);


    }
}

