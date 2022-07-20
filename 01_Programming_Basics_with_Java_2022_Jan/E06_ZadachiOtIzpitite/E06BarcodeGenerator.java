import java.util.Scanner;

public class E06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int num1_1 = number1 % 10;
        int num1_2 = number1 / 10 % 10;
        int num1_3 = number1 / 100 % 10;
        int num1_4 = number1 / 1000 % 10;

        int num2_1 = number2 % 10;
        int num2_2 = number2 / 10 % 10;
        int num2_3 = number2 / 100 % 10;
        int num2_4 = number2 / 1000 % 10;

//        for (int i = num1_1, j = num1_2, k = num1_3, o = num1_4;
//             i <= num2_1 || j <= num2_2 || k <= num2_3 || o <= num2_4;
//             i = i, j = j, k = k, o = o)
        int i = num1_1;
        int j = num1_2;
        int k = num1_3;
        int o = num1_4;

        while (true) {

            if (i > num2_1) {
                j++;
                i = num1_1;
            }
            if (j > num2_2) {
                k++;
                j = num1_2;
            }
            if (k > num2_3) {
                o++;
                k = num1_3;
            }
            if (o > num2_4) {
                return;
            }

            boolean allOdd = (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && o % 2 != 0);

            if (allOdd) {
                System.out.printf("%d%d%d%d ", o, k, j, i);
                i++;
                allOdd = false;
                continue;
            }

            if (i % 2 == 0) {
                i++;
                continue;
            }
            if (i % 2 != 0 && j % 2 == 0) {
                j++;
                continue;
            }
            if (i % 2 != 0 && j % 2 != 0 && k % 2 == 0) {
                k++;
                continue;
            }
            if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && o % 2 == 0) {
                o++;
                continue;
            }

        }

    }
}