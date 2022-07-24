import java.util.Scanner;
// задача 6 от NestedLoops_Exercise е същата, но там е решена с оше един while цикъл, докато тук е с for
public class E06CinemaTickets_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int currentCount = 0;

        int totalCount = 0;

        int student = 0;
        int standard = 0;
        int kids = 0;


        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            currentCount = 0;
            String currentMovie = input;

            int seats = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= seats; i++) {
                boolean isEnd = false;
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    isEnd = true;
                }
                if (isEnd) {
                    break;
                }

                totalCount++;
                currentCount++;


                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                    case "End":
                        isEnd = true;
                        break;
                }


            }

            System.out.printf("%s - %.2f%% full.%n", currentMovie, currentCount * 1.0 / seats * 100);

            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalCount);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalCount * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalCount * 100);
        System.out.printf("%.2f%% kids tickets.%n", kids * 1.0 / totalCount * 100);
    }
}
