package E10_FinalExamRetake02;

import java.util.Scanner;

public class E01WorldTour_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] data = command.split(":");
            String commandName = data[0];

            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String stopName = data[2];
                    if (isValidIndex(index, stops)) {
                        String firstHalf = stops.substring(0, index);
                        String secondHalf = stops.substring(index);
                        stops = firstHalf + stopName + secondHalf;
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        String firstPart = stops.substring(0, startIndex);
                        String secondPart = stops.substring(endIndex + 1);
                        stops = firstPart + secondPart;
//                        stops = stops.substring(0, startIndex) + stops.substring(endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldStop = data[1];
                    String newStop = data[2];
                    if (stops.contains(oldStop)) {
                        stops = stops.replace(oldStop, newStop);
                    }

                    break;
            }
            System.out.println(stops);
            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stops);

    }

    public static boolean isValidIndex(int index, String stops) {
        return index >= 0 && index < stops.length();
    }
}
