import java.util.Scanner;

public class E07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heightHouse = Double.parseDouble(scanner.nextLine());
        double widthHouse = Double.parseDouble(scanner.nextLine());
        double heightRoof = Double.parseDouble(scanner.nextLine());

//        Разхода на зелената боя е 1 литър за 3.4 м2, а на червената – 1 литър за 4.3 м2.

        double frontSide = heightHouse * heightHouse - 2 * 1.2;
        double backSide = heightHouse * heightHouse;
        double sideSide = heightHouse * widthHouse - 1.5 * 1.5;
        double totalSides = frontSide + backSide + sideSide * 2;
//        System.out.println(totalSides);

        double frontRoof = heightHouse * widthHouse;
        double backRoof = heightHouse * widthHouse;
//        System.out.println(frontRoof);
//        System.out.println(backRoof);
        double sideRoof = heightHouse * heightRoof / 2;
//        System.out.println(sideRoof);
        double totalRoof = frontRoof + backRoof + sideRoof * 2;
//        System.out.println(totalRoof);

        double greenPaint = totalSides / 3.4;
        double redPaint = totalRoof / 4.3;
        System.out.printf("%.2f %n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
