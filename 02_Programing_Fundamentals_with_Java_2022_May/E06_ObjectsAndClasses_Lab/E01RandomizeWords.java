package E06_ObjectsAndClasses_Lab;

import java.util.Random;
import java.util.Scanner;

public class E01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int position = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[position];
            words[position] = temp;
        }

        System.out.println(String.join(System.lineSeparator(), words));

    }
}
