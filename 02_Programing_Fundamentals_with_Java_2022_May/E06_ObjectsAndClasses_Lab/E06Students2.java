package E06_ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E06Students2 {

    static class Student {
        String firstName;
        String lasttName;
        int age;
        String city;

        Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lasttName = lastName;
            this.age = age;
            this.city = city;

        }

        boolean isFrom(String city) {
            return this.city.equals(city);
        }

        String getInfo() {
            return String.format("%s %s is %d years old", this.firstName, this.lasttName, this.age);
        }

        String getFirstName() {
            return this.firstName;
        }

        String getLastName() {
            return this.lasttName;
        }

//        void setAge(int age) {
//            this.age = age;
//        }
//
//        void setCity(String city) {
//            this.city = city;
//        }
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

            int index = indexOfStudent(students, firstName, lastName);

            if (index == -1) {
                students.add(new Student(firstName, lastName, age, city));
            } else {
                students.set(index, new Student(firstName, lastName, age, city));
            }
//            Student existing = findStudent(students, firstName, lastName);
//            if (existing == null) {
//                students.add(new Student(firstName, lastName, age, city));
//            } else {
//                existing.setAge(age);
//                existing.setCity(city);
//            }

//            students.add(new Student(firstName, lastName, age, city));

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }

    }

//    private static Student findStudent(List<Student> students, String firstName, String lastName) {
//        for (int i = 0; i < students.size(); i++) {
//            Student s = students.get(i);
//            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
//                return s;
//            }
//        }
//        return null;
//    }

    private static int indexOfStudent(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
