import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

//        double figurine = rent - (rent * 30 / 100);
        double figurine = rent - (rent * 1.0 * 30/100);
        System.out.println(figurine);
//        System.out.println(figurine2);
        double catering = figurine - (figurine * 15 / 100);
        System.out.println(catering);
        double sound = catering / 2;
        System.out.println(sound);

        double allCost = rent + figurine + catering + sound;

        System.out.printf("%.2f", allCost);
        

    }
}