package E10_FinalExamRetake02;

import java.util.Scanner;

public class E01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder route = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!"Travel".equals(input)) {
            String[] data = input.split(":");
            String command = data[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String stopToAdd = data[2];
                    if (isIndexValid(route, index)) {
                        addStop(route, index, stopToAdd);
                    }
//                    System.out.println(route);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (isIndexValid(route, startIndex) && isIndexValid(route, endIndex)) {
                        removeStop(route, startIndex, endIndex);
                    }
//                    System.out.println(route);
                    break;
                case "Switch":
                    String oldString = data[1];
                    String newString = data[2];
                    replaceString (route, oldString, newString);
                    break;
            }

            System.out.println(route);
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", route);

    }

    private static boolean isIndexValid(StringBuilder route, int index) {
        return 0 <= index && index < route.length();
    }

    private static void addStop(StringBuilder route, int index, String stopToAdd) {
        route.insert(index, stopToAdd);
    }

    private static void removeStop(StringBuilder route, int startIndex, int endIndex) {
        route.delete(startIndex, endIndex + 1);
    }

    private static void replaceString(StringBuilder route, String oldString, String newString) {
        int startIndex = route.indexOf(oldString);
        int length = oldString.length();
        while (startIndex != -1) {
            route.replace(startIndex, startIndex + length, newString);
            startIndex = route.indexOf(oldString, startIndex + newString.length());
            // TODO грешка в последния тест, на горния ред не добавях големината на новия стринг... а на стария
            // TODO и когато има няколко повторения и стринговете са с различна дължина и резултата не е коректен
            // TODO а можеше просто да напиша route.replace(oldString, newString);
        }
    }
}
