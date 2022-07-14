import java.util.Scanner;

public class E04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double totalGradesSum = 0;
        int countAllGrades = 0;

        while (!input.equals("Finish")) {
            String presentationName = input;

            double sumCurrentGrade = 0;

            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentGrade = sumCurrentGrade + currentGrade;
            }

            totalGradesSum = totalGradesSum + sumCurrentGrade;

            double averageCurrentGrade = sumCurrentGrade / n;
            System.out.printf("%s - %.2f.%n", presentationName, averageCurrentGrade);

            input = scanner.nextLine();
        }

        double finalGrade = totalGradesSum / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);

    }
}
