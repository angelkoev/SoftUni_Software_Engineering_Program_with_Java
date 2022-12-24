package E05_MidExamRetake02;

import java.util.Arrays;
import java.util.Scanner;

// https://judge.softuni.org/Contests/Practice/Index/2474#1
public class E02ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(data[1]);
                    int index2 = Integer.parseInt(data[2]);
                    swap(index1, index2, numbers);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(data[1]);
                    index2 = Integer.parseInt(data[2]);
                    multiply(index1, index2, numbers);
                    break;
                case "decrease":
                    decrease(numbers);
                    break;


            }


            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

    }

    public static void swap(int index1, int index2, int[] numbers) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public static void multiply(int index1, int index2, int[] numbers) {
        numbers[index1] = numbers[index1] * numbers[index2];
    }

    public static void decrease(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
        }
    }
}
