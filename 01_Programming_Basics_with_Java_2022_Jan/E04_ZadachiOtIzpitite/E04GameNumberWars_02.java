import java.util.Scanner;

public class E04GameNumberWars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        int count1 = 0;
        int count2 = 0;


        String input = scanner.nextLine();

        while (!input.equals("End of game")) {
            int number1 = Integer.parseInt(input);
            int number2 = Integer.parseInt(scanner.nextLine());


            if (number1 > number2) {
                count1 = count1 + number1 - number2;
            } else if (number2 > number1) {
                count2 = count2 + number2 - number1;
            } else if (number1 == number2) {
                int hand1 = Integer.parseInt(scanner.nextLine());
                int hand2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Number wars!");
                if (hand1 > hand2) {
                    System.out.printf("%s is winner with %d points", name1, count1);
                } else {
                    System.out.printf("%s is winner with %d points", name2, count2);
                }
                break;

            }

            input = scanner.nextLine();
        }

        if (input.equals("End of game")) {
            System.out.printf("%s has %d points%n", name1, count1);
            System.out.printf("%s has %d points", name2, count2);
        }

    }
}
