import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {  //delim chisloto na 2 i proveriavame dali ima ostatuk. Ako ostatuka e 0...
            System.out.println("even");
        }
            else { // ako ostatuka ne e 0... number % 2 !=0
                System.out.println("odd");
            }


    }
}
