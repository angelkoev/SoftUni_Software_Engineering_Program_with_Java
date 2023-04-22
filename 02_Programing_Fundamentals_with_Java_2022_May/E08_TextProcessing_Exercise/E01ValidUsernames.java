package E08_TextProcessing_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        List<String> validUsernames = new ArrayList<>();

        for (int i = 0; i < usernames.length; i++) {
            String currentUsername = usernames[i];
            if (isLengthValid(currentUsername) && hadOnlyValidChars(currentUsername)) {
                validUsernames.add(currentUsername);
            }
        }

        for (String validUsername : validUsernames) {
            System.out.println(validUsername);
        }

    }
    private static boolean isLengthValid (String s) {
        return 3 <= s.length() && s.length() <= 16;
    }
    private static boolean hadOnlyValidChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i) == '-' || s.charAt(i) == '_')) {  // става и с Character.isDefined('-')
                return false;
            }
          }
        return  true;
    }
}
