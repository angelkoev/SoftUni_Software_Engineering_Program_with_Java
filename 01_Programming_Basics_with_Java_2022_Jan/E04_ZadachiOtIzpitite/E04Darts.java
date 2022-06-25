import java.util.Scanner;

public class E04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int initialPoints = 301;

        int shotScore = 0;
        int shotCount = 0;
        int badShotCount = 0;

        boolean retire = false;

        while (!(initialPoints == 0)) {

            String type = scanner.nextLine();
            if (type.equals("Retire")) {
                retire = true;
                break;
            }

            int score = Integer.parseInt(scanner.nextLine());


            switch (type) {
                case "Single":
                    shotScore = score;
                    break;
                case "Double":
                    shotScore = score * 2;
                    break;
                case "Triple":
                    shotScore = score * 3;
                    break;
            }

                if (initialPoints >= shotScore) {
                    initialPoints = initialPoints - shotScore;
                    shotCount++;
                } else {
                    badShotCount++;
                }
        }

        if (retire) {
            System.out.printf("%s retired after %d unsuccessful shots.", name, badShotCount);
        } else {
            System.out.printf("%s won the leg with %d shots.", name, shotCount);
        }



    }
}
