package E04_Methods_MoreExercise;

import java.util.Scanner;

public class E03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        printLongerLine(x1, y1, x2, y2, x3, y3, x4, y4);


    }


    private static void printLongerLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        int point1 = x1 - x2;
        int point2 = y1 - y2;
        int point3 = x3 - x4;
        int point4 = y3 - y4;


        if (Math.sqrt(point1 * point1 + point2 * point2) >= Math.sqrt(point3 * point3 + point4 * point4))
        {   // използвам питагоровата теорема, за да намеря най-дългата линия
            printCloserToCender(x1, y1, x2, y2);
        } else{
            printCloserToCender(x3, y3, x4, y4);
        }

    }

    private static void printCloserToCender(int x1, int y1, int x2, int y2) {

        if (Math.sqrt(x1*x1 + y1*y1) < Math.sqrt(x2*x2 + y2*y2)) {   // използвам питагоровата теорема, за да намеря разстоянието до центъра
            System.out.printf("(%d, %d)", x1, y1);
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
            System.out.printf("(%d, %d)", x1, y1);
        }

    }


}
