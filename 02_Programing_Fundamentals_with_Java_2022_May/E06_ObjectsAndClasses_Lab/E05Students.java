package E06_ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05Students {

    static class Student {
        String firstName;
        String lasttName;
        int age;
        String city;

        Student (String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lasttName = lastName;
            this.age = age;
            this.city = city;

        }

       boolean isFrom (String city) {
            return this.city.equals(city);
       }

       String getInfo() {
           return String.format("%s %s is %d years old", this.firstName, this.lasttName, this.age);
       }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] studentParamaters = input.split("\\s+");
            String firstName = studentParamaters[0];
            String lastName = studentParamaters[1];
            int age = Integer.parseInt(studentParamaters[2]);
            String city = studentParamaters[3];

            // TODO: overwrite if exists;

            students.add(new Student(firstName, lastName, age, city));

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }

    }
}
