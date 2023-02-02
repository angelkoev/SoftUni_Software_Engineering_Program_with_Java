package E06_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E00_ObjectAndClasses_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student st1 = new Student("Kaloyan", 5.00);
        Student st2 = new Student("Peter", 5.50);
        Student st3 = new Student("Anton", 5.75);
        Student st4 = new Student("Sofia", 6.00);

        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));

        students.stream().sorted((s1, s2) -> Double.compare(s2.getAvrScore(), s1.getAvrScore()))
                .forEach(s -> System.out.println(s.getData()));


    }

    static class Student {
        String name;
        double avrScore;

        Student() {
        }

        Student(String name, double avrScore) {
            this.name = name;
            this.avrScore = avrScore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAvrScore() {
            return avrScore;
        }

        public void setAvrScore(double avrScore) {
            this.avrScore = avrScore;
        }

        String getData() {
            return String.format("I'am %s with avg. score: %.2f", this.name, this.avrScore);
        }


    }
}
