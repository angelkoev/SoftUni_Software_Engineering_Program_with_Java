import java.util.Scanner;

public class E08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double totalGrade = 0;
        int currentClass = 0;

        while (currentClass < 12) {

          double grade = Double.parseDouble(scanner.nextLine());

            totalGrade = totalGrade + grade;
            currentClass++;

           if (grade < 4) {
               break;
           }

        }
        if (currentClass < 12) {
            System.out.printf("%s has been excluded at %d grade", name, currentClass);
        } else System.out.printf("%s graduated. Average grade: %.2f", name, totalGrade / currentClass);

    }
}
