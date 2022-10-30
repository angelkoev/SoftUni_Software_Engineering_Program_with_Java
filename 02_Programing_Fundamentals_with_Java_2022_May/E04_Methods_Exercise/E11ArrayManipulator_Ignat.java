package E04_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E11ArrayManipulator_Ignat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandArray = command.split(" ");

            switch (commandArray[0]) {

                case "exchange":
                    int exchangeIndex = Integer.parseInt(commandArray[1]);
                    if (exchangeIndex >= 0 && exchangeIndex <= input.length - 1) {
                        exchange(exchangeIndex, input);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    switch (commandArray[1]) {
                        case "even":
                            if (foundIndex(input) && foundEvenIndex(input)) {
                                System.out.println(maxEvenIndex(input));
                            } else {
                                System.out.println("No matches");
                            }
                            break;
                        case "odd":
                            if (foundIndex(input) && foundOddIndex(input)) {
                                System.out.println(maxOddIndex(input));
                            } else {
                                System.out.println("No matches");
                            }
                            break;
                    }
                    break;
                case "min":
                    switch (commandArray[1]) {
                        case "even":
                            if (foundIndex(input) && foundEvenIndex(input)) {
                                System.out.println(minEvenIndex(input));
                            } else {
                                System.out.println("No matches");
                            }
                            break;
                        case "odd":
                            if (foundIndex(input) && foundOddIndex(input)) {
                                System.out.println(minOddIndex(input));
                            } else {
                                System.out.println("No matches");
                            }
                            break;
                    }
                    break;
                case "first":
                    int firstCount = Integer.parseInt(commandArray[1]);
                    switch (commandArray[2]) {
                        case "even":
                            if (firstCount > input.length) {
                                System.out.println("Invalid count");
                            } else if (zeroEvenElements(input)) {
                                System.out.println("[]");
                            } else {
                                System.out.println(Arrays.toString(firstEvenCount(firstCount, input)));
                            }
                            break;
                        case "odd":
                            if (firstCount > input.length) {
                                System.out.println("Invalid count");
                            } else if (zeroOddElements(input)) {
                                System.out.println("[]");
                            } else {
                                System.out.println(Arrays.toString(firstOddCount(firstCount, input)));
                            }
                            break;
                    }
                    break;
                case "last":
                    int lastCount = Integer.parseInt(commandArray[1]);
                    switch (commandArray[2]) {
                        case "even":
                            if (lastCount > input.length) {
                                System.out.println("Invalid count");
                            } else if (zeroEvenElements(input)) {
                                System.out.println("[]");
                            } else {
                                System.out.println(Arrays.toString(lastEvenCount(lastCount, input)));
                            }
                            break;
                        case "odd":
                            if (lastCount > input.length) {
                                System.out.println("Invalid count");
                            } else if (zeroOddElements(input)) {
                                System.out.println("[]");
                            } else {
                                System.out.println(Arrays.toString(lastOddCount(lastCount, input)));
                            }
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(input));

    }
    private static void exchange(int index, int[] array) {
        for (int i = 0; i <= index; i++) {
            int currentElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = currentElement;
        }
    }
    private static int maxEvenIndex(int[] array) {
        int maxEvenIndex = 0;
        int max = Integer.MIN_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                if (array[i] > max) {
                    max = array[i];
                    maxEvenIndex = i;
                }
            }
        }
        return maxEvenIndex;
    }
    private static int maxOddIndex(int[] array) {
        int maxOddIndex = 0;
        int max = Integer.MIN_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                if (array[i] > max) {
                    max = array[i];
                    maxOddIndex = i;
                }
            }
        }
        return maxOddIndex;
    }
    private static boolean foundIndex(int[] array) {
        int current = array[0];
        boolean isTrue = false;
        for (int i = 1; i < array.length; i++) {
            if (current == array[i]) {
                isTrue = true;
            } else {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            return false;
        } else {
            return true;
        }
    }
    private static boolean foundEvenIndex(int[] array) {
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                isTrue = true;
                break;
            } else {
                isTrue = false;
            }
        }
        if (isTrue) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean foundOddIndex(int[] array) {
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                isTrue = true;
                break;
            } else {
                isTrue = false;
            }
        }
        if (isTrue) {
            return true;
        } else {
            return false;
        }
    }
    private static int minEvenIndex(int[] array) {
        int minEvenIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                if (array[i] < min) {
                    min = array[i];
                    minEvenIndex = i;
                }
            }
        }
        return minEvenIndex;
    }
    private static int minOddIndex(int[] array) {
        int minOddIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                if (array[i] < min) {
                    min = array[i];
                    minOddIndex = i;
                }
            }
        }
        return minOddIndex;
    }
    private static int[] firstEvenCount(int count, int[] array) {
        int[] result = new int[count];


        for (int i = 0; i < result.length;) {

            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    result[i] = array[j];
                    i++;
                    if (i == count) {
                        break;
                    }
                }
            }
            break;
        }
        int fullElementCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                fullElementCount++;
            }
        }
        int[] temp = new int[fullElementCount];
        for (int i = 0; i < temp.length;) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] != 0) {
                    temp[i] = result[j];
                    i++;
                    if (i == fullElementCount) {
                        break;
                    }
                }
            }
            break;
        }

        return temp;
    }
    private static int[] firstOddCount(int count, int[] array) {
        int[] result = new int[count];

        for (int i = 0; i < result.length;) {

            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 != 0) {
                    result[i] = array[j];
                    i++;
                    if (i == count) {
                        break;
                    }
                }
            }
            break;
        }
        int fullElementCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                fullElementCount++;
            }
        }
        int[] temp = new int[fullElementCount];
        for (int i = 0; i < temp.length;) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] != 0) {
                    temp[i] = result[j];
                    i++;
                    if (i == fullElementCount) {
                        break;
                    }
                }
            }
            break;
        }

        return temp;
    }
    private static int[] lastEvenCount(int count, int[] array) {
        int[] result = new int[count];

        int counter = 0;
        for (int i = result.length - 1; i >= 0;) {

            for (int j = array.length - 1; j >= 0; j--) {
                if (array[j] % 2 == 0) {
                    result[i] = array[j];
                    i--;
                    counter++;
                    if (counter == count) {
                        break;
                    }
                }
            }
            break;
        }
        int fullElementCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                fullElementCount++;
            }
        }
        int[] temp = new int[fullElementCount];
        for (int i = 0; i < temp.length;) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] != 0) {
                    temp[i] = result[j];
                    i++;
                    if (i == fullElementCount) {
                        break;
                    }
                }
            }
            break;
        }

        return temp;
    }
    private static int[] lastOddCount(int count, int[] array) {
        int[] result = new int[count];

        int counter = 0;
        for (int i = result.length - 1; i >= 0;) {

            for (int j = array.length - 1; j >= 0; j--) {
                if (array[j] % 2 != 0) {
                    result[i] = array[j];
                    i--;
                    counter++;
                    if (counter == count) {
                        break;
                    }
                }
            }
            break;
        }
        int fullElementCount = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                fullElementCount++;
            }
        }
        int[] temp = new int[fullElementCount];
        for (int i = 0; i < temp.length;) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] != 0) {
                    temp[i] = result[j];
                    i++;
                    if (i == fullElementCount) {
                        break;
                    }
                }
            }
            break;
        }

        return temp;
    }
    private static boolean zeroEvenElements(int[] array) {
        boolean foundElement = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                foundElement = true;
                break;
            } else {
                foundElement = false;
            }
        }
        if (foundElement) {
            return false;
        } else {
            return true;
        }

    }
    private static boolean zeroOddElements(int[] array) {
        boolean foundElement = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                foundElement = true;
                break;
            } else {
                foundElement = false;

            }
        }
        if (foundElement) {
            return false;
        } else {
            return true;
        }
    }

}
