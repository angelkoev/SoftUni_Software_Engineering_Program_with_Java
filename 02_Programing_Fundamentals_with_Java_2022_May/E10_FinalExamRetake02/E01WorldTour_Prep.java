package E10_FinalExamRetake02;

import java.util.Scanner;

public class E01WorldTour_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] data = input.split(":");
            String command = data[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String string = data[2];
                    if (isIndexValid(index, stops.length())) {
                        stops = stops.substring(0, index) + string + stops.substring(index);
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (isIndexValid(startIndex, stops.length()) && isIndexValid(endIndex, stops.length())) {
                        stops = stops.substring(0, startIndex) + stops.substring(endIndex + 1);
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = data[1];
                    String newString = data[2];
                    if (stops.contains(oldString)) {
                        stops = stops.replace(oldString, newString);
                    }
                    System.out.println(stops);
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stops);

    }

    public static boolean isIndexValid(int index, int size) {
        return 0 <= index && index < size;
    }
}
