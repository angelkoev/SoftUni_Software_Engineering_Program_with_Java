import java.util.Scanner;

public class E01BirthdayParty {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int rent = Integer.parseInt(scanner.nextLine());

        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animator = rent / 3;

        double result = rent + cake + drinks + animator;

        System.out.println(result);




    }
}
