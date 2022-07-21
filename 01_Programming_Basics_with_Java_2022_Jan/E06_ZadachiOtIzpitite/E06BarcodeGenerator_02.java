import java.util.Scanner;

public class E06BarcodeGenerator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int digit4 = number1 % 10;
        int digit3 = number1 / 10 % 10;
        int digit2 = number1 / 100 % 10;
        int digit1 = number1 / 1000 % 10;


        for (number1 = number1; number1 <= number2; number1++) {

            int num1_1 = number1 % 10;
            int num1_2 = number1 / 10 % 10;
            int num1_3 = number1 / 100 % 10;
            int num1_4 = number1 / 1000 % 10;

            int num2_1 = number2 % 10;
            int num2_2 = number2 / 10 % 10;
            int num2_3 = number2 / 100 % 10;
            int num2_4 = number2 / 1000 % 10;

            int i = num1_1;
            int j = num1_2;
            int k = num1_3;
            int o = num1_4;

//                  if (i > num2_1) {
//                    j++;
//                    i = num1_1;
//                      continue;
//                }
//                if (j > num2_2) {
//                    k++;
//                    j = num1_2;
//                }
//                if (k > num2_3) {
//                    o++;
//                    k = num1_3;
//                }
//                if (o > num2_4) {
//                    return;
//                }

            boolean allOdd = (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && o % 2 != 0);
            boolean allLow = (i <= num2_1 && i >= digit4 && j <= num2_2 && j >= digit3 && k <= num2_3 && k >= digit2 && o <= num2_4 && o >= digit1);

            if (allOdd && allLow) {
                System.out.printf("%d%d%d%d ", o, k, j, i);
//                    i++;
                allOdd = false;
//                    continue;
            }
//
//                if (i % 2 == 0) {
//                    i++;
//                    continue;
//                }
//                if (i % 2 != 0 && j % 2 == 0) {
//                    j++;
//                    continue;
//                }
//                if (i % 2 != 0 && j % 2 != 0 && k % 2 == 0) {
//                    k++;
//                    continue;
//                }
//                if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && o % 2 == 0) {
//                    o++;
//                    continue;
//                }

        }


    }
}