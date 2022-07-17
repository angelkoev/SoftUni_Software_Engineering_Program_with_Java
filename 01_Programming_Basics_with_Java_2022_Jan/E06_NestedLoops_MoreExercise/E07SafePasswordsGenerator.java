import java.util.Scanner;

public class E07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int numberMaxPasswords = Integer.parseInt(scanner.nextLine());

        int intA = 35;
        char charA = (char) intA;
        int intB = 64;
        char charB = (char) intB;
        int count = 0;

        boolean maxMumberReached = false;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (intA > 55) {
                    intA = 35;
                    charA = (char) intA;
                }
                if (intB > 96) {
                    intB = 64;
                    charB = (char) intB;
                }

                System.out.printf("%c%c%d%d%c%c|", charA, charB, i, j, charB, charA);
                charA++;
                charB++;
                intA++;
                intB++;
                count++;
                if (count >= numberMaxPasswords) {
                    maxMumberReached = true;
                    break;
                }

            }
            if (maxMumberReached) {
                break;
            }

        }


    }
}
