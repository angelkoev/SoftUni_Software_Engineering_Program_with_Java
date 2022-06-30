import java.util.Scanner;

public class E03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < controlNumber) {  //тук обръщаме условието, което е сумата да е по-голяма или равна на първото число, тоест ни трябва обратното сравнение
     // става и с         while (!(sum >= controlNumber)) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }

        System.out.println(sum);

    }
}
