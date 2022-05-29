import java.util.Scanner;

public class SpeedInfo_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        серия от проверки:
//        1. искаме за 1 променлива да проверим повече от 2 неща
//        2. искаме да провери няколко неща и само еедно от тях да е вярно

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if (speed <= 150) {
            System.out.println("fast");
        } else if (speed <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }


    }
}
