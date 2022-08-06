import java.util.Scanner;

public class E05BestPlayer_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!input.equals("END")) {
            String name = input;
            int goals = Integer.parseInt(scanner.nextLine());

            if (maxGoals < goals) {
                maxGoals = goals;
                bestPlayer = name;
            }

            if (goals >= 10) {
                break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }


    }
}
