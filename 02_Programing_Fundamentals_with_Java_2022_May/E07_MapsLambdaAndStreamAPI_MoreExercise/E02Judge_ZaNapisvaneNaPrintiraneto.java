package E07_MapsLambdaAndStreamAPI_MoreExercise;

import java.util.*;

public class E02Judge_ZaNapisvaneNaPrintiraneto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> students = new LinkedHashMap<>();
        Map<String, Integer> results = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> contest = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("no more time")) {
            String[] data = input.split(" -> ");
            String name = data[0];
            String cont = data[1];
            int points = Integer.parseInt(data[2]);

            students.putIfAbsent(name, new LinkedHashMap<>());
            results.putIfAbsent(name, 0);
            contest.putIfAbsent(cont, new LinkedHashMap<>());
            contest.get(cont).put(name, points);

            if (!students.get(name).containsKey(cont)) {
                students.get(name).put(cont, points);
                results.put(name, results.get(name) + points);
            } else if (points > students.get(name).get(cont)) {
                results.put(name, results.get(name) + points - students.get(name).get(cont));
                // първо добавяме разликата от новите точки и старите точки (иначе се натрупват, а не трябва)
                // после обновяваме точките в съответния курс
                students.get(name).put(cont, points);
            }


            input = scanner.nextLine();
        }

        System.out.printf("");


        contest.entrySet()
                .stream()
                .forEach((entry -> System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size())));


//        contest.entrySet().forEach((a, b) -> b. ).stream()
//                .sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
//                .forEach((entry -> list.add(String.format("%s -> %d%n", entry.getKey(), entry.getValue()))));


        contest.entrySet()
                .stream()
                .forEach((entry -> entry.getValue().forEach((k, v) -> System.out.printf("%s <::> %d%n", k, v))));


        // https://github.com/DimitarRachev/SoftUni-Java-Fundamentals/tree/main/LecturesAndExercises/p21MapsLambdaAndStreamAPIMoreExercise


        int counter = 0;

        System.out.println();

        // TODO: в countPerContest май трябва да съкранввявам хората... и бройхката да я взема от големината на HashMap.size();

        System.out.println("Individual standings:");

        List<String> listResults = new ArrayList<>();

        results.entrySet().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
                .forEach((entry -> listResults.add(String.format("%s -> %d%n", entry.getKey(), entry.getValue()))));

        for (int i = 0; i < listResults.size(); i++) {
            System.out.printf("%d. %s", i + 1, listResults.get(i));
        }

//
    }
}

