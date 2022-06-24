import java.util.Scanner;

public class E04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());

        int length = 0;
        int price = 0;
        int tickets = 0;
        int items = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            length = input.length();

            if (length > 8) {
                price = input.charAt(0) + input.charAt(1);
                if (price <= voucher) {
                    voucher = voucher - price;
                    tickets++;
                } else {
                    break;
                }
            } else {
                price = input.charAt(0);
                if (price <= voucher) {
                    voucher = voucher - price;
                    items++;
                } else {
                    break;
                }

            }

            input = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(items);

    }
}
