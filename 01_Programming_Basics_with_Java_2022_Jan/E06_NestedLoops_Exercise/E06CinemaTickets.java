import java.util.Scanner;

public class E06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countAllTickets = 0;
        int countStudentTickets = 0;
        int countStandartTickets = 0;
        int countKidsTickets = 0;

        while (!input.equals("Finish")) {

            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;
            String typeTicket = scanner.nextLine();
            while (!typeTicket.equals("End")) {
                countCurrentTickets++;
                countAllTickets++;

//                switch (typeTicket) {
//                    case "student":
//                        countStudentTickets++;
//                        break;
//                    case "standard":
//                        countStandartTickets++;
//                        break;
//                    case "kid":
//                        countKidsTickets++;
//                        break;
//                }

                if (typeTicket.equals("student")) {
                    countStudentTickets++;
                } else if (typeTicket.equals("standard")) {
                    countStandartTickets++;
                } else if (typeTicket.equals("kid")) {
                    countKidsTickets++;
                }

                if (countCurrentTickets >= seats) {
                    break;
                }

                typeTicket = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seats * 100);
            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countAllTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudentTickets * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandartTickets * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKidsTickets * 1.0 / countAllTickets * 100);

    }
}
