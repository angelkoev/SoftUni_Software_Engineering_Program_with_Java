import java.util.Scanner;

public class E05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {

            double needMonty = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while (savedMoney < needMonty) {
                double sum = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + sum;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }

    }
}
