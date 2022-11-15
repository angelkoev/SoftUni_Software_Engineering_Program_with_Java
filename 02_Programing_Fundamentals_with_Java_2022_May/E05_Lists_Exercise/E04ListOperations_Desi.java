package E05_Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListOperations_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"32 54 21 12 4 0 23" -> split(" ") -> ["32", "54", "21", "12", "4", "0", "23"]
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("End")){
            //•	"Add {number}" - add number at the end
            //•	"Insert {number} {index}" - insert number at given index
            //•	Remove {index} - remove that index
            //•	Shift left {count} - first number becomes last 'count' times
            //•	Shift right {count} - last number becomes first 'count' times
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];
            switch(commandName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandData[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int insertIndex = Integer.parseInt(commandData[2]);
                    if(isValidIndex(insertIndex, numbers.size())) {
                        numbers.add(insertIndex, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int removedIndex = Integer.parseInt(commandData[1]);
                    if(isValidIndex(removedIndex, numbers.size())){
                        numbers.remove(removedIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String shiftType = commandData[1]; //left or right
                    int count = Integer.parseInt(commandData[2]);
                    if (shiftType.equals("left")) {
                        shiftLeft(numbers, count);
                    } else if (shiftType.equals("right")) {
                        shiftRight(numbers, count);
                    }
                    break;
            }


            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            //взимаме последния елемент -> слагам го на първо място (индекс = 0) -> премахвам от последното място
            int lastElement = numbers.get(numbers.size() - 1);
            numbers.add(0, lastElement);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            //взимам първия елемент -> слагам накрая -> премахвам от първото място
            int firstNumber = numbers.get(0);
            numbers.add(firstNumber);
            numbers.remove(0);
        }

    }

    public static boolean isValidIndex(int index, int size) {
        //true -> е валиден
        //false -> е невалиден
        return index >= 0 && index <= size - 1;
    }
}