package E07_MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class E06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> dataBase = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String courseName = data[0];
            String studentName = data[1];

            dataBase.putIfAbsent(courseName, new ArrayList<>());
            dataBase.get(courseName).add(studentName);


            input = scanner.nextLine();
        }

        dataBase.entrySet().stream().forEach(entry -> {
            //key: име на курса
            //value: списък с хората
            //име на курса -> бр. хората
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().stream().forEach(studentName -> System.out.println("-- " + studentName));
        });
    }

}

