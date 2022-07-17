import java.util.Scanner;

public class E06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char endSector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int oddSeats = Integer.parseInt(scanner.nextLine());

        int evenSeats = oddSeats + 2;

        int countRows = 0;
        int totalSeats = 0;

        for (char i = 'A'; i <= endSector; i++) {
            for (int j = 1; j <= rows + countRows; j++) {
                if (j % 2 != 0) {
                    char seat = 'a';
                    for (int k = 1; k <= oddSeats; k++) {
                        System.out.printf("%c%d%c%n", i, j, seat);
                        seat++;
                        totalSeats++;
                    }
                } else {
                    char seat = 'a';
                    for (int k = 1; k <= evenSeats; k++) {
                        System.out.printf("%c%d%c%n", i, j, seat);
                        seat++;
                        totalSeats++;
                    }
                }

            }
            countRows++;
        }
        System.out.println(totalSeats);
    }
}
