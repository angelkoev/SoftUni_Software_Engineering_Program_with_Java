import java.util.Scanner;

public class E04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int noPaintPercent = Integer.parseInt(scanner.nextLine());

        int areaToPaint = height * width * 4 * (100 - noPaintPercent) / 100;

        int leftPaint = 0;

        boolean noMorePaint = false;

        String input = scanner.nextLine();


        while (!input.equals("Tired!")) {

            int paintLiters = Integer.parseInt(input);

            if (paintLiters < areaToPaint) {
                areaToPaint = areaToPaint - paintLiters;
            } else {
                leftPaint = paintLiters - areaToPaint;
                noMorePaint = true;
                break;
            }


            input = scanner.nextLine();

        }
        if (input.equals("Tired!")) {
            System.out.printf("%d quadratic m left.", areaToPaint);
        } else if (leftPaint == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
               System.out.printf("All walls are painted and you have %d l paint left!", leftPaint);
        }
    }
}
