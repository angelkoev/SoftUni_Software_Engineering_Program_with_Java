package E04_Methods_Exercise;

import java.util.Scanner;

public class E11ArrayManipulator_IvayloRashkov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();//стринг от масив
        int[] arrayAsNumber = stringArrayToIntArray(input);//обръщаме в числов масив

        input = scanner.nextLine().toLowerCase();//четем команда
        while (!input.equals("end")) {

            String[] arrayOfStrings = input.split("\\s+");
            String keyword = arrayOfStrings[0];



            if (keyword.equals("exchange")){
                //вадим номера на индекса от текста
                int exchangeNumber = extractNumberFromExchangeCommand(input);
                //проверяваме дали е валиден индекса
                if (isValidIndexOfArray(exchangeNumber, arrayAsNumber)) {
                    //принтираме новия масив
                    printExchangedArray(arrayAsNumber, exchangeNumber);
                } else {
                    System.out.println("Invalid index");
                }
            }else if (keyword.equals("max")){
                maxEvenOrOddPrint(input,arrayAsNumber);
            }else if (keyword.equals("min")){
                minEvenOrOddPrint(input, arrayAsNumber);
            }else if (keyword.equals("first")){
                firstCountsOddEvenPrint(input,arrayAsNumber);
            }else if (keyword.equals("last")){
                lastOddOrEvenCountsPrint(input,arrayAsNumber);
            }



            input = scanner.nextLine().toLowerCase();//нов вход
        }

    }

    private static void lastOddOrEvenCountsPrint(String input, int[] array) {
        //work correctly
        String[] stringArray = input.split("\\s+");
        int number = Integer.parseInt(stringArray[1]);

        if (number > array.length) {
            System.out.println("Invalid count");
        } else if (number < array.length) {
            System.out.println("Invalid count");
        } else {
            if (stringArray[2].equals("even")) {
                lastEvenElementsCount(input, array);
            } else if (stringArray[2].equals("odd")) {
                lastOddElementsCount(input, array);
            }
        }

    }

    private static void lastOddElementsCount(String input, int[] array) {
        String[] newArray = input.split("\\s+");

        int count = Integer.parseInt(newArray[1]);
        int[] printArray = new int[count];
        int prevIndex = -1;
        for (int i = count; i >= 0; i--) {
            for (int j = array.length; j >= 0; j--) {
                if ((array[j] % 2 == 1) && (prevIndex != j)) {
                    printArray[i] = array[j];
                    prevIndex = j;
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i]);

            if (i != printArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    private static void lastEvenElementsCount(String input, int[] array) {
        String[] newArray = input.split("\\s+");

        int count = Integer.parseInt(newArray[1]);
        int[] printArray = new int[count];
        int prevIndex = -1;
        for (int i = count; i >= 0; i--) {
            for (int j = array.length; j >= 0; j--) {
                if ((array[j] % 2 == 0) && (prevIndex != j)) {
                    printArray[i] = array[j];
                    prevIndex = j;
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i]);

            if (i != printArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    private static void firstCountsOddEvenPrint(String input, int[] array) {
        //work correctly
        String[] stringArray = input.split("\\s+");
        int number = Integer.parseInt(stringArray[1]);

        if (number > array.length) {
            System.out.println("Invalid count");
        } else if (number < array.length) {
            System.out.println("Invalid count");
        } else {
            if (stringArray[2].equals("even")) {
                firstEvenElementsCount(input, array);
            } else if (stringArray[2].equals("odd")) {
                firstOddElementsCount(input, array);
            }
        }

    }

    private static void firstOddElementsCount(String input, int[] array) {
        //testing phase
        String[] newArray = input.split("\\s+");
        int numbers = Integer.parseInt(newArray[1]);
        int[] printArray = new int[numbers];
        int prevIndex = -1;
        for (int i = 0; i < printArray.length; i++) {
            for (int j = i; j < array.length; j++) {
                if ((array[j] % 2 == 1) && (prevIndex != j)) {
                    printArray[i] = array[j];
                    prevIndex = j;
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i]);

            if (i != printArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }

    private static void firstEvenElementsCount(String input, int[] array) {
        //testing phase
        String[] newArray = input.split("\\s+");
        int numbers = Integer.parseInt(newArray[1]);
        int[] printArray = new int[numbers];
        int prevIndex = -1;
        for (int i = 0; i < printArray.length; i++) {
            for (int j = i; j < array.length; j++) {
                if ((array[j] % 2 == 0) && (prevIndex != j)) {
                    printArray[i] = array[j];
                    prevIndex = j;
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i]);

            if (i != printArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }

    private static void maxEvenOrOddPrint(String input, int[] array) {
        //work correctly
        int maxNumber = -1;
        if (input.equals("max odd")) {
            maxNumber = findMaxOddNumber(array);
            if (maxNumber != Integer.MIN_VALUE) {
                System.out.println(maxNumber);
            } else {
                System.out.printf("No matches");
            }
        } else if (input.equals("max even")) {
            maxNumber = findMaxEvenNumber(array);
            if (maxNumber != Integer.MIN_VALUE) {
                System.out.println(maxNumber);
            } else {
                System.out.printf("No matches");
            }
        }
    }

    private static void minEvenOrOddPrint(String input, int[] array) {
        //work correctly
        int minNumber;
        if (input.equals("min odd")) {
            minNumber = findMinOddNumber(array);
            if (minNumber != Integer.MAX_VALUE) {
                System.out.println(minNumber);
            } else {
                System.out.printf("No matches");
            }
        } else if (input.equals("min even")) {
            minNumber = findMinEvenNumber(array);
            if (minNumber != Integer.MAX_VALUE) {
                System.out.println(minNumber);
            } else {
                System.out.printf("No matches");
            }
        }
    }

    private static void printExchangedArray(int[] array, int exchangeNumber) {
        //work correctly //2 3 4 7 9 1 ; 3 4 7 9 1 2 ; 4 7 9 1 2 3
        for (int i = 0; i < exchangeNumber; i++) {
            int firstNum = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstNum;
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

    }

    private static int[] stringArrayToIntArray(String arrayAsString) {
        //work correctly
        String[] array = arrayAsString.split("\\s+");
        int[] arrayAsNumbers = new int[array.length];
        for (int i = 0; i < arrayAsNumbers.length; i++) {
            arrayAsNumbers[i] = Integer.parseInt(array[i]);
        }
        return arrayAsNumbers;
    }

    private static boolean isValidIndexOfArray(int number, int[] array) {
        //work correctly
        if (number > array.length - 1) {
            return false;
        } else if (number < 0) {
            return false;
        }
        return true;
    }

    private static int extractNumberFromExchangeCommand(String string) {
        //work correctly
        String[] commandAsArray = string.split("\\s+");
        int number = Integer.parseInt(commandAsArray[1]);
        return number;
    }

    private static int findMaxEvenNumber(int[] array) {
        //work correctly
        int maxEvenIndex = Integer.MIN_VALUE;
        int maxEvenNumber = Integer.MIN_VALUE;
        ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] >= maxEvenNumber) {
                    maxEvenNumber = array[i];
                    maxEvenIndex = i;
                }
            }
        }
        return maxEvenIndex;
    }

    private static int findMaxOddNumber(int[] array) {
        //work correctly
        int maxOddIndex = Integer.MIN_VALUE;
        int maxOddNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                if (array[i] >= maxOddNumber) {
                    maxOddNumber = array[i];
                    maxOddIndex = i;
                }
            }
        }
        return maxOddIndex;
    }

    private static int findMinEvenNumber(int[] array) {
        //test phase
        int minEvenIndex = Integer.MAX_VALUE;
        int minEvenNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] <= minEvenNumber) {
                    minEvenNumber = array[i];
                    minEvenIndex = i;
                }
            }
        }
        return minEvenIndex;
    }

    private static int findMinOddNumber(int[] array) {
        //test phase
        int minOddIndex = Integer.MAX_VALUE;
        int minOddNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                if (array[i] <= minOddNumber) {
                    minOddNumber = array[i];
                    minOddIndex = i;
                }
            }
        }
        return minOddIndex;
    }
}
