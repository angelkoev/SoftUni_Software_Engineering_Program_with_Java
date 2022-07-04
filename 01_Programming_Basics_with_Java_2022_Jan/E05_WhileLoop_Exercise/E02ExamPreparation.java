import java.util.Scanner;

public class E02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrade = Integer.parseInt(scanner.nextLine());

        int countProblems = 0;
        double sumGrade = 0;
        String lastProblem = "";
        int countPoorGrades = 0;
//        boolean isPoor = false;

        String command = scanner.nextLine();

        while (!command.equals("Enough")) {

            String problemName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                countPoorGrades++;
            }

            if (countPoorGrades >= maxPoorGrade) {
//                isPoor = true;
                break;
            }


            countProblems++;
            sumGrade = sumGrade + grade;
            lastProblem = problemName;

            command = scanner.nextLine();
        }

//        if (isPoor) {
//            System.out.printf("You need a break, %d poor grades.", countPoorGrades);
        if (countPoorGrades >= maxPoorGrade) {
            System.out.printf("You need a break, %d poor grades.", countPoorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrade / countProblems);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
