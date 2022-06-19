import java.util.Scanner;

public class E05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

//        •	"Facebook" -> 150 лв.
//        •	"Instagram" -> 100 лв.
//        •	"Reddit" -> 50 лв


        for (int i = 1; i <= countTabs; i++) {
            if (salary > 0) {
                String nameTab = scanner.nextLine();
                switch (nameTab) {
                    case "Facebook":
                        salary = salary - 150;
                        break;
                    case "Instagram":
                        salary = salary - 100;
                        break;
                    case "Reddit":
                        salary = salary - 50;
                        break;
                }
//            if (salary <=0) {        така може да се прекъсне цикъла
//                break;
//            }
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }

    }
}
