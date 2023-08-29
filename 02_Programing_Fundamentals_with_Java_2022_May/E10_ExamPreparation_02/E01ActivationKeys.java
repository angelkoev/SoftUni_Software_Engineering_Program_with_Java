package E10_ExamPreparation_02;

import java.util.Locale;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2302#0
public class E01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String[] data = input.split(">>>");
            String command = data[0];

            switch (command) {
                case "Contains":
                    String substring = data[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = data[1];
                    int startIndex = Integer.parseInt(data[2]);
                    int endIndex = Integer.parseInt(data[3]);
//                    substring = activationKey.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")) {
//                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                        activationKey = activationKey.substring(0, startIndex) + activationKey.substring(startIndex, endIndex).toUpperCase() + activationKey.substring(endIndex);
                        System.out.println(activationKey);
                    } else {
//                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                        activationKey = activationKey.substring(0, startIndex) + activationKey.substring(startIndex, endIndex).toLowerCase() + activationKey.substring(endIndex);
                        System.out.println(activationKey);
                    }
                    break;
                case "Slice":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);
//                    substring = activationKey.substring(start, end);
//                    activationKey = activationKey.replace(substring, "");
                    activationKey = activationKey.replace(activationKey.substring(start, end), "");
                    System.out.println(activationKey);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", activationKey);

    }
}
