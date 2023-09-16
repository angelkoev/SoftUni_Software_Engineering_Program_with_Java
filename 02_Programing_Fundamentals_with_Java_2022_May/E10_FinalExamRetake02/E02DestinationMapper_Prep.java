package E10_FinalExamRetake02;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02DestinationMapper_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();

        String regex = "([=\\/])(?<town>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(places);

        List<String> towns = new LinkedList<>();

        int travelPoints = 0;

        while (matcher.find()) {

            String place = matcher.group("town");

            towns.add(place);

            travelPoints += place.length();

        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", towns));

        System.out.printf("Travel Points: %d", travelPoints);

    }
}
