import java.util.Scanner;

public class E05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChanges = change * 100;

        int count = 0;

        while (coinsChanges > 0) {
            if (coinsChanges >= 200) {
                coinsChanges = coinsChanges - 200;
                count++;
            } else if (coinsChanges >= 100) {
                coinsChanges = coinsChanges - 100;
                count++;
            } else if (coinsChanges >= 50) {
                coinsChanges = coinsChanges - 50;
                count++;
            } else if (coinsChanges >= 20) {
                coinsChanges = coinsChanges - 20;
                count++;
            } else if (coinsChanges >= 10) {
                coinsChanges = coinsChanges - 10;
                count++;
            } else if (coinsChanges >= 5) {
                coinsChanges = coinsChanges - 5;
                count++;
            } else if (coinsChanges >= 2) {
                coinsChanges = coinsChanges - 2;
                count++;
            } else if (coinsChanges >= 1) {
                coinsChanges = coinsChanges - 1;
                count++;
            } else {
                break;
            }

//            }
//            coinsChanges = Math.floor(cointsChanges);
//        }
        }

        System.out.println(count);

    }
}
