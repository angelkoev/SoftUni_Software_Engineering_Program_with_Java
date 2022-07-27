import java.util.Scanner;

public class E06HighJump_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHeight = Integer.parseInt(scanner.nextLine());

        int currentHeight = wantedHeight - 30;
        int badJumpCount = 0;
        int totalCount = 0;
        boolean isSucceed = true;

        int currentJump = Integer.parseInt(scanner.nextLine());

        while (true) {

            totalCount++;

            if (currentJump > currentHeight) {
                currentHeight = currentHeight + 5;
                badJumpCount = 0;
            } else{
                badJumpCount++;
            }

            if (badJumpCount == 3) {
                isSucceed = false;
                break;
            }
            if (currentHeight > wantedHeight) {
                break;
            }

            currentJump = Integer.parseInt(scanner.nextLine());

        }

        if (isSucceed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHeight, totalCount);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalCount);
        }
    }
}
