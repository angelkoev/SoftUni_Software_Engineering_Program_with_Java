package E02_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

//        int  courses = (int ) Math.ceil( (double) persons / capacity);
//        System.out.println(courses);

        double courses = Math.ceil(persons * 1.0 / capacity);

        System.out.printf("%.0f", courses);
    }
}
