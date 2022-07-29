import java.util.Scanner;

public class E06HighJump_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHeight = Integer.parseInt(scanner.nextLine());

        int badJumpCount = 0;
        int totalCount = 0;
        boolean isSucceed = true;
        int currentHeight = 0;

        for (int i = wantedHeight - 30; i <= wantedHeight; i = i + 5) {
            int currentJump = Integer.parseInt(scanner.nextLine());
            totalCount++;
            currentHeight = i;

            if (currentJump > i) {
                badJumpCount = 0;
            } else {
                badJumpCount++;
                i = i - 5;
            }

            if (badJumpCount == 3) {
                isSucceed = false;
                break;
            }

        }

        if (isSucceed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHeight, totalCount);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalCount);
        }
    }
}
