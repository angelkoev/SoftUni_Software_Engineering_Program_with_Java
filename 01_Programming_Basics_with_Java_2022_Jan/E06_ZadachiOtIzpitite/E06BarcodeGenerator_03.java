import java.util.Scanner;

public class E06BarcodeGenerator_03 {
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

//            int num1_1 = num1_1;
//            int num1_2 = num1_2;
//            int num1_3 = num1_3;
//            int num1_4 = num1_4;

//            if (num1_1 > num2_1) {
//                continue;
//
//            }
//            if (num1_2 > num2_2) {
//                continue;
//
//            }
//            if (num1_3 > num2_3) {
//                continue;
//            }

            boolean allOdd = (num1_1 % 2 != 0 && num1_2 % 2 != 0 && num1_3 % 2 != 0 && num1_4 % 2 != 0);
            boolean allLow = (num1_1 <= num2_1 && num1_1 >= digit4 && num1_2 <= num2_2 && num1_2 >= digit3 && num1_3 <= num2_3 && num1_3 >= digit2 && num1_4 <= num2_4 && num1_4 >= digit1);

            if (allOdd && allLow) {
                System.out.printf("%d%d%d%d ", num1_4, num1_3, num1_2, num1_1);
            }

        }


    }
}