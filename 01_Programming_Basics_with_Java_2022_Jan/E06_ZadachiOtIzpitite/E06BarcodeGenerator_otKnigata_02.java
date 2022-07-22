import java.util.Scanner;

public class E06BarcodeGenerator_otKnigata_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        for (int i = firstInput.charAt(0); i <= secondInput.charAt(0); i++) {
            for (int j = firstInput.charAt(1); j <= secondInput.charAt(1); j++) {
                for (int k = firstInput.charAt(2); k <= secondInput.charAt(2); k++) {
                    for (int l = firstInput.charAt(3); l <= secondInput.charAt(3); l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", (char)i, (char)j, (char)k, (char)l);
                        }
                    }
                }
            }
        }


    }
}
