package E08_TextProcessing_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E01ValidUsernames_withRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Arrays.stream(scanner.nextLine().split(", "))
//                .filter(username -> username.length() >=3 && username.length() <=16)
//                .filter(username -> username.matches("[a-zA-Z_\\-\\d]+"))
//                .forEach(System.out::println);

        Arrays.stream(scanner.nextLine().split(", "))
                .filter(username -> username.matches("[a-zA-Z0-9\\-_]{3,16}"))
                .forEach(System.out::println);
    }
}
