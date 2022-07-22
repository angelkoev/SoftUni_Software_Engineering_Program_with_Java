import java.util.Scanner;

public class E06BarcodeGenerator_Mitko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int firstDigitStart = Integer.parseInt(String.valueOf(String.valueOf(intervalStart).charAt(0)));
        int firstDigitEnd = Integer.parseInt(String.valueOf(String.valueOf(intervalEnd).charAt(0)));
        int secondDigitStart = Integer.parseInt(String.valueOf(String.valueOf(intervalStart).charAt(1)));
        int secondDigitEnd= Integer.parseInt(String.valueOf(String.valueOf(intervalEnd).charAt(1)));
        int thirdDigitStart = Integer.parseInt(String.valueOf(String.valueOf(intervalStart).charAt(2)));
        int thirdDigitEnd = Integer.parseInt(String.valueOf(String.valueOf(intervalEnd).charAt(2)));
        int fourthDigitStart = Integer.parseInt(String.valueOf(String.valueOf(intervalStart).charAt(3)));
        int fourthDigitEnd = Integer.parseInt(String.valueOf(String.valueOf(intervalEnd).charAt(3)));
        String finalString = "";

        for (int i = intervalStart; i <= intervalEnd; i++) {
            int firstDigit = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(0)));
            int secondDigit = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(1)));
            int thirdDigit = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(2)));
            int fourthDigit = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(3)));
            if (firstDigitStart <= firstDigit && firstDigit <= firstDigitEnd && secondDigitStart <= secondDigit && secondDigit <= secondDigitEnd &&
                    thirdDigitStart <= thirdDigit && thirdDigit <= thirdDigitEnd && fourthDigitStart <= fourthDigit && fourthDigit <= fourthDigitEnd &&
                    firstDigit % 2 != 0 && secondDigit % 2 != 0 && thirdDigit % 2 != 0 && fourthDigit % 2 != 0) {
                finalString += i + " ";
            }
        }
        System.out.println(finalString);
    }
}
