import java.util.Scanner;

public class E04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());

        double totalSumGrade = 0;

        double p1 = 0; // 2 - 3
        double p2 = 0; // 3 - 4
        double p3 = 0; // 4 - 5
        double p4 = 0; // 5 - 6

        for (int i = 1; i <= numberStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 3) {
                p1++;
                totalSumGrade = totalSumGrade + grade;
            } else if (grade < 4) {
                p2++;
                totalSumGrade = totalSumGrade + grade;
            } else if (grade < 5) {
                p3++;
                totalSumGrade = totalSumGrade + grade;
            } else {
                p4++;
                totalSumGrade = totalSumGrade + grade;
            }
        }

//        System.out.println(p4);
//        System.out.println(p3);   pravia proverkite v obraten red i zatova nakraia
//        System.out.println(p2);   pri smiataneto i otpechatvaneto mi obrushtam reda
//        System.out.println(p1);


        System.out.printf("Top students: %.2f%%", p4 / numberStudents * 100);
        System.out.println();
        System.out.printf("Between 4.00 and 4.99: %.2f%%", p3 / numberStudents * 100);
        System.out.println();
        System.out.printf("Between 3.00 and 3.99: %.2f%%", p2 / numberStudents * 100);
        System.out.println();
        System.out.printf("Fail: %.2f%%", p1 / numberStudents * 100);
        System.out.println();
        System.out.printf("Average: %.2f", totalSumGrade / numberStudents);

    }
}