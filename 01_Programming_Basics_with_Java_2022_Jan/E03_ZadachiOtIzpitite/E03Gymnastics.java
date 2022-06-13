import java.util.Scanner;

public class E03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String discipline = scanner.nextLine();
        double score = 0;

        if (country.equals("Russia")) {
            switch (discipline) {
                case "ribbon":
                    score = 9.1+9.4;
                    break;
                case "hoop":
                    score = 9.3+9.8;
                    break;
                case "rope":
                    score = 9.6+9;
                    break;
            }
            } else if (country.equals("Bulgaria")) {
                switch (discipline) {
                    case "ribbon":
                        score = 9.6+9.4;
                        break;
                    case "hoop":
                        score = 9.55+9.75;
                        break;
                    case "rope":
                        score = 9.5+9.4;
                        break;
                }
        } else if (country.equals("Italy")) {
            switch (discipline) {
                case "ribbon":
                    score = 9.2+9.5;
                    break;
                case "hoop":
                    score = 9.45+9.35;
                    break;
                case "rope":
                    score = 9.7+9.15;
                    break;
            }
        }

        double scoreDiff = 100 - score / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.", country, score, discipline);
        System.out.println();
        System.out.printf("%.2f%%", scoreDiff);

    }
}
