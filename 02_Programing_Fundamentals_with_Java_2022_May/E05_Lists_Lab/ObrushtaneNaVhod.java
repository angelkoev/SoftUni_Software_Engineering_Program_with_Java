package E05_Lists_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// имаме вход от думи, който четем до получаваме на символ '.'
// след което ги изпечатваме в обратен ред от този на постъшването


public class ObrushtaneNaVhod {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals(".")) {
            words.add(input);
            input = scanner.nextLine();
        }

        for (int i = words.size()-1; i >=0 ; i--) {
            System.out.println(words.get(i));
        }


    }
}
