import java.util.Scanner;

public class E12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        String numberFour = "";

        boolean isValid = false;
        boolean isPassFound = false;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        isValid = false;

                        if ((i < j) && (k > l) && ((i * j + k * l) == controlNumber)) {
                            isValid = true;
                        }

                        if (isValid) {
//                            if (count > 0) {
//                                System.out.printf(" ");
//                            }
                            count++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }

                        if (count == 4) {
                            numberFour = "" + i + j + k + l;
                            count++;
                            isPassFound = true;
                        }

                    }
                }
            }
        }
        if (isPassFound) {
            System.out.println();
            System.out.printf("Password: %s", numberFour);
        } else {
            System.out.println();
            System.out.printf("No!");
        }

    }
}
