package E07_MapsLambdaAndStreamAPI_MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// не знаех как да вкарам няколко HashMap-a един в друг !!!

public class E01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contentAndPass = new LinkedHashMap<>();

        Map<String, Map<String, Integer>> students = new TreeMap<>();
        Map<String, Integer> results = new LinkedHashMap<>();

//        Creating two Simple Hashmaps: InnerMap and OuterMap
//
//        HashMap<String, HashMap<String, String>> outerMap = new HashMap<String, HashMap<String,String>>();
//        HashMap<String, String> innerMap = new HashMap<String, String>();
//        Populating the HashMaps
//
//        innerMap.put("InnerKey", "InnerValue");
//        outerMap.put("OuterKey", innerMap);
//        Retreiving values from HashMaps
//
//        String value = ((HashMap<String, String>)outerMap.get("OuterKey")).get("InnerKey").toString();
//        System.out.println("Retreived value is : " + value);

        String inputContestsAndPass = scanner.nextLine();
        while (!inputContestsAndPass.equals("end of contests")) {
            String[] data = inputContestsAndPass.split(":");
            contentAndPass.putIfAbsent(data[0], data[1]);

            inputContestsAndPass = scanner.nextLine();
        }

        String inputStudentInfo = scanner.nextLine();
        while (!inputStudentInfo.equals("end of submissions")) {
            String[] data = inputStudentInfo.split("=>");
            String course = data[0];
            String pass = data[1];
            if ((contentAndPass.containsKey(course)) && pass.equals(contentAndPass.get(course))) {
                String name = data[2];
                int currentPoints = Integer.parseInt(data[3]);
                students.putIfAbsent(name, new LinkedHashMap<>());  //създаваме нов LinkedHashMap, където за всеки курс да си пазим токите
                results.putIfAbsent(name, 0);  // в този HashMap пазим само точките от всички курсове

                if (!students.get(name).containsKey(course)) {
                    students.get(name).put(course, currentPoints);
                    results.put(name, results.get(name) + currentPoints);
                } else if (currentPoints > students.get(name).get(course)) {
                    results.put(name, results.get(name) + currentPoints - students.get(name).get(course));
                    // първо добавяме разликата от новите точки и старите точки (иначе се натрупват, а не трябва)
                    // после обновяваме точките в съответния курс
                    students.get(name).put(course, currentPoints);
                }

            }

            inputStudentInfo = scanner.nextLine();
        }
                                // това долу го копирах и много не го разбирам и го копирах...
        String winner = "";
        int maxPoints = 0;
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() > maxPoints) {
                maxPoints = entry.getValue();
                winner = entry.getKey();
            }

        }
        System.out.printf("Best candidate is %s with total %d points.%n", winner, maxPoints);
        System.out.println("Ranking: ");
        students.forEach((k, v) -> {            // и това тука много не го разбирам и го копирах
            System.out.printf("%s%n", k);       // тоест разбирам го, ама сам няма да успея да го напиша...
            v.entrySet().stream().sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
                    .forEach(score -> System.out.printf("#  %s -> %d%n", score.getKey(), score.getValue()));

        });

    }
}
