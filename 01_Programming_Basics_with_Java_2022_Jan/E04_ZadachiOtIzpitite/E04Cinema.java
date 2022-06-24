import java.util.Scanner;

public class E04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cinemaCapacity = Integer.parseInt(scanner.nextLine());

        int peopleInTheCinema = 0;
        int discount = 0;
        boolean full = false;

        String input = scanner.nextLine();

        while (!input.equals("Movie time!")) {

            int number = Integer.parseInt(input);


            if (number <= cinemaCapacity-peopleInTheCinema) {
                peopleInTheCinema = peopleInTheCinema + number;
            } else {
                full = true;
                break;
            }

            if (number % 3 == 0) {
                discount = discount + 5;
            }


            input = scanner.nextLine();
        }

        int income = peopleInTheCinema * 5 - discount;

        if (full) {
            System.out.printf("The cinema is full.%n");
            System.out.printf("Cinema income - %d lv.", income);
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", cinemaCapacity - peopleInTheCinema);
            System.out.printf("Cinema income - %d lv.", income);
        }


    }
}
