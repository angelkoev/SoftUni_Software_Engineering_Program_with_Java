import java.util.Scanner;

public class E01ReadText_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (String text = scanner.nextLine(); !text.equals("Stop") ; text = scanner.nextLine()) {
            System.out.println(text);
        }
    }
}
