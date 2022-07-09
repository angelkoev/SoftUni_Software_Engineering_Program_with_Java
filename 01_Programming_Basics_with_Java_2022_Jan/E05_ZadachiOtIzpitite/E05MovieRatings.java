import java.util.Scanner;
import java.util.function.DoubleFunction;

public class E05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double maxScore = Double.MIN_VALUE;
        double minScore = Double.MAX_VALUE;
        String ratingMax = "";
        String ratingMin = "";
        double totalScore = 0;


        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            if (rating > maxScore) {
                maxScore = rating;
                ratingMax = name;
                totalScore = totalScore + rating;
            } else if (rating < minScore) {
                minScore = rating;
                ratingMin = name;
                totalScore = totalScore + rating;
            } else {
                totalScore = totalScore + rating;
            }


        }


        System.out.printf("%s is with highest rating: %.1f%n", ratingMax, maxScore);
        System.out.printf("%s is with lowest rating: %.1f%n", ratingMin, minScore);
        System.out.printf("Average rating: %.1f", totalScore*1.0/ count);

    }
}