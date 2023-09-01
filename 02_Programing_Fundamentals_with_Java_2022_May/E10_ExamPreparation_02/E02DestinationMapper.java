package E10_ExamPreparation_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://judge.softuni.org/Contests/Practice/Index/2518#1

public class E02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=\\/]{1})(?<destination>[A-Z]{1}[A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);


        List<String> destinationsList = new ArrayList<>();

        int points = 0;

        while (matcher.find()) {

            String destination = matcher.group("destination");
            points += destination.length();
            destinationsList.add(destination);


        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinationsList));
        System.out.println("Travel Points: " + points);

    }
}
