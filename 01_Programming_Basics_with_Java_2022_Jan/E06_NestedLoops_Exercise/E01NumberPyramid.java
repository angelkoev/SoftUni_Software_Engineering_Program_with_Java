import java.util.Scanner;

public class E01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean end = false;
        int currentNum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                currentNum++;

                if (currentNum > n) {
                    end = true;
                    break;
                }

                System.out.print(currentNum + " ");
            }
            if (end) {
                break;
            }
            System.out.println();
        }


    }
}
