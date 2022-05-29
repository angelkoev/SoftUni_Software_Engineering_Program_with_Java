import java.util.Scanner;

public class E03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHours = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        //15 min
        // 1h 46 min + 15
        // 60 + 46 + 15 = 121 min
        // 121/ 60 = 2h
        // 121 % 60 = 1 min

        int allMin = (initHours * 60) + initMin + 15; //nakraia pribaviame 15 min ot uslovieto

        int hour = allMin / 60;
        int min = allMin % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour,min);


    }
}
