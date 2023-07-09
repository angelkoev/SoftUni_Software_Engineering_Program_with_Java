package E08_TextProcessing_MoreExercise;

import java.util.Scanner;

public class E05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();

        System.out.printf("<h1>%n%s%n</h1>%n", title);

        String article = scanner.nextLine();

        System.out.printf("<article>%n%s%n</article>%n", article);

        String input = scanner.nextLine();

        while (!input.equals("end of comments")) {
            System.out.printf("<div>%n%s%n</div>%n", input);

            input = scanner.nextLine();
        }

    }
}
