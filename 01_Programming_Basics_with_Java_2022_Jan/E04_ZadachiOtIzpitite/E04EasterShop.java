import java.util.Scanner;

public class E04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEgds = Integer.parseInt(scanner.nextLine());

        boolean close = false;
        int soldEggs = 0;
        boolean noEggs = false;
        int tryToBuyEggs = 0;

        while (!close && initialEgds >= 0) {

            String action = scanner.nextLine();
            if (action.equals("Close")) {
                close = true;
                break;    // tia komentiranite otdolu sa za kogato ne biah napravil tozi break !!!
            }

//            if (action.equals("Close")) {
//
//            } else {
                int eggs = Integer.parseInt(scanner.nextLine());

                if (action.equals("Buy")) {
                    initialEgds = initialEgds - eggs;
                    soldEggs += eggs;
                    tryToBuyEggs = eggs;
                } else if (action.equals("Fill")) {
                    initialEgds = initialEgds + eggs;
                }
                }
            if (initialEgds <= 0) {
                noEggs = true;
            }
//        }


        if (noEggs) {
            System.out.printf("Not enough eggs in store!%n");
            System.out.printf("You can buy only %d.", tryToBuyEggs + initialEgds);
        }

        if (close) {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.", soldEggs);


        }

    }
}
