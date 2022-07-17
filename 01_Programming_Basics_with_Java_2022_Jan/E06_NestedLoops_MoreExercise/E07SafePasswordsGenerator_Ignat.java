import java.util.Scanner;

public class E07SafePasswordsGenerator_Ignat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isTrue = false;

        for (char i = 35; i <= 55; i++) {
            for (char j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        count++;

                        if (count > max) {
                            isTrue = true;
                            break;
                        }
                        System.out.print("" + i + j + k + l + j + i + "|");
                        if (k == a && l == b) {
                            isTrue = true;
                            break;
                        }
                        i++;
                        if (i > 55) {
                            i = 35;
                        }
                        j++;
                        if (j > 96) {
                            j = 64;
                        }
                    }
                    if (isTrue) {
                        break;
                    }
                }
                if (isTrue) {
                    break;
                }
            }
            if (isTrue) {
                break;
            }
        }
    }
}

