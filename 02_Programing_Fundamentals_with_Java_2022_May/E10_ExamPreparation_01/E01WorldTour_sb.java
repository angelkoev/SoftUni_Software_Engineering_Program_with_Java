package E10_ExamPreparation_01;

import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2518#0

public class E01WorldTour_sb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        StringBuilder sb = new StringBuilder(stops);

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] tokens = input.split(":");

            String command = tokens[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String newStop = tokens[2];
                    if (isIndexValid(index, sb.length())) {
                        sb.insert(index, newStop);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (isIndexValid(startIndex, sb.length()) && isIndexValid(endIndex, sb.length())) {
//                        sb.replace(startIndex, endIndex + 1, "");
                        sb.delete(startIndex, endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    if (sb.toString().contains(oldString)) {

                        int indexToStart = sb.indexOf(oldString);
//                        sb.replace(indexToStart, indexToStart + oldString.length(), newString);

                        while (indexToStart != -1) {
                            sb.replace(indexToStart, indexToStart + oldString.length(), newString);
                            indexToStart = sb.indexOf(oldString, indexToStart + newString.length());

//                        String updatedText = sb.toString().replace(oldString, newString);
//                        sb = new StringBuilder(updatedText);


//                        int indexToDelete = sb.indexOf(oldString);
//                        sb.replace(indexToDelete, oldString.length(), newString);

//                        sb.insert(indexToDelete, newString);
                        }
                    }
                    break;
            }
//            System.out.println(sb.toString());
            System.out.println(sb);

            input = scanner.nextLine();
        }

        System.out.print("Ready for world tour! Planned stops: ");
//        System.out.println(sb.toString());
        System.out.println(sb);

    }

    public static boolean isIndexValid(int index, int inputLength) {
        return 0 <= index && index < inputLength;
    }
}
