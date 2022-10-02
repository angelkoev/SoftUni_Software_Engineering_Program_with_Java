package E03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] train = new int[number];

        int sum = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
            System.out.print(train[i] + " ");
        }

//        for (int i = 0; i < train.length; i++) {
//            System.out.print(train[i] + " ");
//        }

//        Arrays.stream(train).forEach(wagon -> System.out.print(wagon + " "));

//        System.out.println();
//        System.out.println(sum);
        System.out.printf("%n%d", sum); //вместо %d, става и с %s

    }
}