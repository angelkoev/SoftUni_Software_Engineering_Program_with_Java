import java.util.Scanner;

public class E01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
//        String text = scanner.nextLine();   може и така !!!

        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }


    }
}
