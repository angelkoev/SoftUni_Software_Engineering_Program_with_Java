import java.util.Scanner;

public class E04EasterShop_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availableEggs = Integer.parseInt(scanner.nextLine());
        String action = "";
        int eggs = 0;
        int soldEggs = 0;
        boolean closed = false;
        boolean noEggs = false;

        while (!closed) {
            action = scanner.nextLine();
            if (action.equals("Close")) {
                closed = true;
                break;
            }
            eggs = Integer.parseInt(scanner.nextLine());


            if (action.equals("Buy")) {
                if (availableEggs < eggs) {
                    noEggs = true;
                    break;
                }
                availableEggs = availableEggs - eggs;
                soldEggs = soldEggs + eggs;
            }

            if (action.equals("Fill")) {
                availableEggs = availableEggs + eggs;
            }
        }


        if (noEggs) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", availableEggs);
        }
        if (closed) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }


    }
}
