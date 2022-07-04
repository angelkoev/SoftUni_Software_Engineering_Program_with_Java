import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBooks = scanner.nextLine();

        int countBooks = 0;

        boolean wasFound = false;

        String command = scanner.nextLine();

        while (!command.equals("No More Books")) {

            String currentBook = command;

            if (command.equals(wantedBooks)) {
                wasFound = true;
                break;
            }

            countBooks++;

            command = scanner.nextLine();

//            }
//            if (currentBook.equals("No More Books")) {
//                break;

        }

        if (wasFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }

    }
}
