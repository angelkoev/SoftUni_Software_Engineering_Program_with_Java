package E05_Lists_MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        String result = "";
        for (int i = 0; i < numbers.size(); i++) {
            int sum = 0;
            int currentNum = Integer.parseInt(numbers.get(i));
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum /= 10;
            }
//            if (sum > text.size() - 1) {
            while (sum > text.size() - 1) {  // със while избягваме грешката при индексиране,
                sum = sum - text.size();  // когато числото над 2 пъти по-голямо от големината на стринга
            }
            result += text.get(sum);
            text.remove(sum);

        }

        System.out.println(result);

    }
}
