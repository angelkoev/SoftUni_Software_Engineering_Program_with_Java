package E10_FinalExamRetake02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=\\/])(?<city>[A-Z][A-Za-z]{2,})\\1";
        // TODO тук бях объркал, бях писал {3}, а то е {2}, понеже преди това имаме още един символ, който после не го броим

        Pattern city = Pattern.compile(regex);
        Matcher cityMatch = city.matcher(input);

        List<String> cities = new ArrayList<>();

        while (cityMatch.find()) {
            cities.add(cityMatch.group("city"));
        }


//        System.out.println("Destinations: " + String.join(", ", cities));
// TODO и с горния ред става, като замества долните редове !!!

        System.out.printf("Destinations: ");

        StringJoiner joiner = new StringJoiner(", ");
        cities.forEach(item -> joiner.add(item.toString()));
        System.out.println(joiner);

//        System.out.println("Travel Points: " + cities
//                .stream()
//                .mapToInt(d -> d.length())
//                .sum());
        // TODO това замества долните сметки и печатане, ама още не съм го усвпил добре !!!

        int travelPoints = 0;
        for (String s : cities) {
            travelPoints += s.length();
                    }

        System.out.printf("Travel Points: %d", travelPoints);


    }
}
