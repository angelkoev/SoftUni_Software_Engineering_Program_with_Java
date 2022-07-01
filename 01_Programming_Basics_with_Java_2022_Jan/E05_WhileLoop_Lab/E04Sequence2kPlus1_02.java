import java.util.Scanner;

public class E04Sequence2kPlus1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int i = 1;

        while (i <= number) {
            System.out.println(i);
            i = i * 2 + 1;
        }

    }
}
