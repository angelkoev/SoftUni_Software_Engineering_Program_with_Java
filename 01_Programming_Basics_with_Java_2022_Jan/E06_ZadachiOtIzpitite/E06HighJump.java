import java.util.Scanner;

public class E06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHeight = Integer.parseInt(scanner.nextLine());

        int currentHeight = wantedHeight - 30;
        int badJumpCount = 0;
        int totalCount = 0;
        boolean notSucceed = false;


        while (!notSucceed) {
            int currentJump = Integer.parseInt(scanner.nextLine());
            totalCount++;

            if (currentJump > currentHeight) {
                currentHeight = currentHeight + 5;
                badJumpCount = 0;
            } else {
                badJumpCount++;
            }

            if (badJumpCount == 3) {
                notSucceed = true;
                break;
            }
            if (currentHeight > wantedHeight) { //тук бях писал (currentJump > wantedHeight) и даваше 70/100
                notSucceed = false;
                break;
            }

//            currentJump = Integer.parseInt(scanner.nextLine());

        }

        if (!notSucceed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHeight, totalCount);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalCount);
        }
    }
}
