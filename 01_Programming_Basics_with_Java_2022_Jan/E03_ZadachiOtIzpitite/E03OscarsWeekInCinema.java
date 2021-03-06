import java.util.Scanner;

public class E03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String hall = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        ;
        double price = 0;

        switch (name) {
            case "A Star Is Born": {
                switch (hall) {
                    case "normal":
                        price = 7.5;
                        break;
                    case "luxury":
                        price = 10.5;
                        break;
                    case "ultra luxury":
                        price = 13.5;
                        break;
                }
            }
            break;
            case "Bohemian Rhapsody":
                switch (hall) {
                    case "normal":
                        price = 7.35;
                        break;
                    case "luxury":
                        price = 9.45;
                        break;
                    case "ultra luxury":
                        price = 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (hall) {
                    case "normal":
                        price = 8.15;
                        break;
                    case "luxury":
                        price = 10.25;
                        break;
                    case "ultra luxury":
                        price = 13.25;
                        break;
                }
                break;
            case "The Favourite": {
                switch (hall) {
                    case "normal":
                        price = 8.75;
                        break;
                    case "luxury":
                        price = 11.55;
                        break;
                    case "ultra luxury":
                        price = 13.95;
                        break;
                }
                break;
            }
        }
        double totalPrice = people * price;
        System.out.printf("%s -> %.2f lv.", name, totalPrice);
    }
}