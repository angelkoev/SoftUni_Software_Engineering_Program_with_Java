import java.util.Scanner;

public class E01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolLiters = Integer.parseInt(scanner.nextLine());
        int debitPipe1 = Integer.parseInt(scanner.nextLine());
        int debitPipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double firstPipeLiters = debitPipe1 * hours;
        double secondPipeLiters = debitPipe2 * hours;

        double allLiters = firstPipeLiters + secondPipeLiters;

        double diff = Math.abs(poolLiters - allLiters);

        if (poolLiters >= allLiters) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", allLiters/poolLiters*100, firstPipeLiters/allLiters*100, secondPipeLiters/allLiters*100);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, diff);
        }



    }
}
