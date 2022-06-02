import java.util.Scanner;

public class E02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstResult = scanner.nextLine();
        String secondResult = scanner.nextLine();
        String thirdResult = scanner.nextLine();

        int firstNumber1 = firstResult.charAt(0);
        int secondNumber1 = firstResult.charAt(2);

        int firstNumber2 = secondResult.charAt(0);
        int secondNumber2 = secondResult.charAt(2);

        int firstNumber3 = thirdResult.charAt(0);
        int secondNumber3 = thirdResult.charAt(2);

        int won = 0;
        int lost = 0;
        int draw = 0;

        if (firstNumber1 > secondNumber1) {
            won = won + 1;
        } else if (firstNumber1 < secondNumber1) {
            lost = lost + 1;
        } else if (firstNumber1 == secondNumber1) {
            draw = draw + 1;
        }


        if (firstNumber2 > secondNumber2) {
            won = won + 1;
        } else if (firstNumber2 < secondNumber2) {
            lost = lost + 1;
        } else if (firstNumber2 == secondNumber2) {
            draw = draw + 1;
        }

        if (firstNumber3 > secondNumber3) {
            won = won + 1;
        } else if (firstNumber3 < secondNumber3) {
            lost = lost + 1;
        } else if (firstNumber3 == secondNumber3) {
            draw = draw + 1;
        }

        System.out.printf("Team won %d games.%n", won);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", draw);

    }
}
