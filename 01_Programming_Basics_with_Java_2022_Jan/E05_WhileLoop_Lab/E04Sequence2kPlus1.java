import java.util.Scanner;

public class E04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i = i * 2 + 1) {
            System.out.println(i);
        }



    }
}
