import java.util.Scanner;

public class E03RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

      //  System.out.println(a * b); //moje i bez promenlivata

        int area = a * b;
        System.out.println(area);

    }
}
