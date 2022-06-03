import java.util.Scanner;

public class E01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        switch (number) { //alt + enter = replace switch s if
            case 1:  //number == 1
                System.out.println("Monday"); //kakvo shte se sluchi ako gornoto e viarno
                break; // krai na switch proverkata !!!
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:  //kakvo shte pravi ako nishto ot gornoto ne e izpulneno
                System.out.println("Error");
                break;
        }


    }
}
