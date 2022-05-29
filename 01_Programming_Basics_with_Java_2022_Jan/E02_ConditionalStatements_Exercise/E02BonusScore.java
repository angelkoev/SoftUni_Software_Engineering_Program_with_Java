import java.util.Scanner;

public class E02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initPoints = Integer.parseInt(scanner.nextLine());

        double bonus = 0;


        if (initPoints <= 100) {
            bonus = 5;
        } else if (initPoints <= 1000) {
            bonus = initPoints * 0.20;

        } else {
            bonus = initPoints * 0.10;

        }

        if (initPoints % 2 == 0) {
            bonus = bonus + 1;
        }

        // 12345 % 5 = modulno delene na 5, za da vidim dali ima ostatuk pri delene na 5
        // if (initPoints % 5 == 0) - tova e ako e kratno na 5, no ne i dali zavurshva na 5...

        if (initPoints % 10 == 5) {   //taka proveriavane ma kolko zavurshva chisloto
            bonus = bonus + 2;
        }

        double totalPoints = initPoints + bonus;

        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f%n", totalPoints);

    }
}
