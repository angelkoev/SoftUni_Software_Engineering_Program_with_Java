package E06_ObjectsAndClasses_MoreExercise;

import java.util.*;

// ЗА РЕВАШАНЕ... ама още не знам как да я направя !!!
// първата закоментирана част е моя, другата е от решение на Desi

//public class E01CompanyRoster {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        List<Department> persons = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String personsData = scanner.nextLine();
//
//        }
//
//
//
//
//    }
//
//    static class Department {
////        name, salary, position, department, email, and age.
//        private String name;
//        private double salary;
//        private String position;
//        private String email;
//        private int age;
//
//        public Department(String name, double salary, String position, String email, int age) {
//            this.name = name;
//            this.salary = salary;
//            this.position = position;
//            this.email = email;
//            this.age = age;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public double getSalary() {
//            return salary;
//        }
//
//        public void setSalary(double salary) {
//            this.salary = salary;
//        }
//
//        public String getPosition() {
//            return position;
//        }
//
//        public void setPosition(String position) {
//            this.position = position;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
//        }
//    }
//}


//import java.text.DecimalFormat;
//import java.util.Arrays;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class E01CompanyRoster_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Department> departments = new HashMap<String, Department>(); //име на отдел -> ОТДЕЛ (име, служители)
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Employee employee;
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            //6 parameters
            if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }
            //4 parameters
            else if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            }
            //5 parameters
            else {
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }

            //служителя -> отдел
            departments.putIfAbsent(department, new Department(department)); //създаваме си нов отдел
            departments.get(department).getEmployees().add(employee);

        }

        //име на отдела -> отдел (служители)
        Department maxAverageSalaryDepartment = departments.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getName());
        maxAverageSalaryDepartment.getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
        static class Department {
            private String name;
            private List<Employee> employees;

            public Department(String name) {
                this.name = name;
                this.employees = new ArrayList<>();
            }

            public List<Employee> getEmployees() {
                return this.employees;
            }

            public double getAverageSalary() {
                return this.employees
                        .stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0.0);
            }

            public String getName() {
                return this.name;
            }
        }

        static class Employee {
            //name, salary, position, department, email and age
            //mandatory
            private String name;
            private double salary;
            private String position;
            private String department;
            //optional
            private String email;
            private int age;


            //1 начин -> name, salary, position, department
            public Employee(String name, double salary, String position, String department) {
                this.name = name;
                this.salary = salary;
                this.position = position;
                this.department = department;
                this.email = "n/a";
                this.age = -1;
            }

            //2 начин -> name,salary, position, department, email, age
            public Employee(String name, double salary, String position, String department, String email, int age) {
                this(name, salary, position, department);
                this.email = email;
                this.age = age;
            }

            //3 начин -> name, salary, position, department, email
            public Employee(String name, double salary, String position, String department, String email) {
                this(name, salary, position, department);
                this.email = email;
                this.age = -1;
            }

            //4 начин -> name, salary, position, department, age
            public Employee(String name, double salary, String position, String department, int age) {
                this(name, salary, position, department);
                this.age = age;
                this.email = "n/a";
            }

            public double getSalary() {
                return this.salary;
            }

            @Override
            public String toString() {
                return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
            }

        }
    }