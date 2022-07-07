import java.util.Scanner;

public class E05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goals = Integer.parseInt(scanner.nextLine());

        String bestName = "";
        int maxGoals = Integer.MIN_VALUE;

        boolean hattrick = false;

        while (!name.equals("END")) {


            if (goals > maxGoals) {
                bestName = name;
                maxGoals = goals;
            }
            if (goals >= 3) {
                hattrick = true;
            }
            if (goals >= 10) {
                break;
            }

            name = scanner.nextLine();
            if (name.equals("END")) {
                break;
            }
            goals = Integer.parseInt(scanner.nextLine());

        }

        System.out.printf("%s is the best player!", bestName);
        System.out.println();
        if (hattrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}
