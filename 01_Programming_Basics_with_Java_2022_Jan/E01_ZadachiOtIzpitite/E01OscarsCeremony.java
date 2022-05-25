import java.util.Scanner;

public class E01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

//        •	Статуетки  – цената им е 30% по-малка от наема на залата
//        •	Кетъринг – цената му е 15% по-малка от тази на статуетките
//        •	Озвучаване – цената му е 1 / 2 от цената за кетъринг

        double statuetka = rent * 0.7;
//        System.out.println(statuetka);
        double catering = statuetka * 0.85;
//        System.out.println(catering);
        double sound = catering * 0.5;
//        System.out.println(sound);

        double result = rent + statuetka + catering + sound;

        System.out.printf("%.2f", result);




    }
}
