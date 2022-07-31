import java.util.Scanner;

public class E06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxPoints = Double.MIN_VALUE;
        String maxWord = "";


        String input = scanner.nextLine();

        while (!input.equals("End of words")) {

            double currentSum = 0;


            for (int i = 0; i < input.length(); i++) {

                int digit = input.charAt(i);

                currentSum = currentSum + digit;


            }
            switch (input.charAt(0)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y':
                    currentSum = currentSum * input.length();
                    break;
                default:
                    currentSum = Math.floor(currentSum * 1.0 / input.length());
            }

            if (currentSum > maxPoints) {
                maxPoints = currentSum;
                maxWord = input;
            }
            input = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", maxWord, maxPoints);

    }
}
