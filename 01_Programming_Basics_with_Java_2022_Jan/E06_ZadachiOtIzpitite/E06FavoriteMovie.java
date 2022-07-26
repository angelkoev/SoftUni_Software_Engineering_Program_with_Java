import java.util.Scanner;

public class E06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movieName = scanner.nextLine();

        int maxValue = Integer.MIN_VALUE;
        String movieMaxValue = "";

        int countMovies = 0;


        while (!movieName.equals("STOP")) {
            countMovies++;
            if (countMovies == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            int currentMovieScore = 0;
            int conutLowLetters = 0;

            for (int i = 0; i < movieName.length(); i++) {

                int currentDigit = movieName.charAt(i);

                if (currentDigit >= 65 && currentDigit <= 90) {
                    currentMovieScore += currentDigit - movieName.length();
                } else if (currentDigit >= 97 && currentDigit <= 122) {
                    currentMovieScore += currentDigit - 2 * movieName.length();
                } else {
                    currentMovieScore += currentDigit;
                }

            }
            if (currentMovieScore > maxValue) {
                maxValue = currentMovieScore;
                movieMaxValue = movieName;
            }


            movieName = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", movieMaxValue, maxValue);

    }
}
