import java.util.Scanner;

public class E11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = 1000000;
        double oddMax = -1000000;
        double evenSum = 0;
        double evenMin = 1000000;
        double evenMax = -1000000;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0) {
                oddSum = oddSum + number;
                if (oddMin >= number) {
                    oddMin = number;
                }
                if (oddMax <= number) {
                    oddMax = number;
                }
            }
            if (i % 2 == 0) {
                evenSum = evenSum + number;
                if (evenMin >= number) {
                    evenMin = number;
                }
                if (evenMax <= number) {
                    evenMax = number;
                }
            }

        }

        System.out.printf("OddSum=%.2f,", oddSum);
        System.out.println();
        if (oddMin != 1000000) {
            System.out.printf("OddMin=%.2f,", oddMin);
        } else {
            System.out.printf("OddMin=No,");
        }
        System.out.println();
        if (oddMax != -1000000) {
            System.out.printf("OddMax=%.2f,", oddMax);
        } else {
            System.out.printf("OddMax=No,");
        }
        System.out.println();
        System.out.printf("EvenSum=%.2f,", evenSum);
        System.out.println();
        if (evenMin != 1000000) {
            System.out.printf("EvenMin=%.2f,", evenMin);
        } else {
            System.out.printf("EvenMin=No,");
        }
        System.out.println();
        if (evenMax != -1000000) {
            System.out.printf("EvenMax=%.2f", evenMax);
        } else {
            System.out.printf("EvenMax=No");
        }

//        System.out.println(oddSum);
//        System.out.println(oddMin);
//        System.out.println(oddMax);
//        System.out.println(evenSum);
//        System.out.println(evenMin);
//        System.out.println(evenMax);


    }
}
