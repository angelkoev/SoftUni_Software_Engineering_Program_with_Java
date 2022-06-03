import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

       String firstResult = scanner.nextLine();

       int firstNumber = firstResult.charAt(0);
       int secondNumber = firstResult.charAt(2);

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        }
    }

