import java.util.Scanner;

public class E02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char skip = scanner.nextLine().charAt(0);

        int count = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end ; j++) {
                for (int k = start; k <= end ; k++) {
                    if (i != skip && j != skip && k != skip) {
                        count++;
                        System.out.printf("%c%c%c ", i, j, k);

                    }
                }
            }
        }
        System.out.println(count);
    }
}
