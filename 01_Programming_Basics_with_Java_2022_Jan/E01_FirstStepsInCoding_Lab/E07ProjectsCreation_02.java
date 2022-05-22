import java.util.Scanner;

public class E07ProjectsCreation_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int hours = count * 3;
//	      "The architect {името на архитекта} " +
//        "will need {необходими часове} " +
//        "hours to complete {брой на проектите}" +
//        " project/s."

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, count);
    }
}