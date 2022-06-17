import java.util.Scanner;

public class E05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i <= text.length() - 1 ; i++) {
            char c = text.charAt(i);
            System.out.println(c);
                    }
    }
}
