package E05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08AnonymousThreat_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesInput = scanner.nextLine();
        List<String> names = Arrays.stream(namesInput.split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];
            if (commandName.equals("merge")) {
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);
//                if (startIndex < 0) {
//                    startIndex = 0;
//                }
//                if (endIndex > names.size() - 1) {
//                    endIndex = names.size() -1;
//                }
                startIndex = Math.max(startIndex, 0); // като горните 2 проверки
                endIndex = Math.min(endIndex, names.size() - 1);
                boolean isStartIndexValid = isValidIndex(startIndex, names.size());
                boolean isEndIndexValid = isValidIndex(endIndex, names.size());
                if (isStartIndexValid && isEndIndexValid) {

                    StringBuilder resultMerge = new StringBuilder();
                    for (int i = startIndex; i <= endIndex; i++) {
                        resultMerge.append(names.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, resultMerge.toString());
                }
            } else if (commandName.equals("divide")) {
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String elementForDivide = names.get(index);
                names.remove(index);
                int partSize = elementForDivide.length() / partitions;
                int begin = 0;

                for (int i = 1; i < partitions; i++) {
                    names.add(index, elementForDivide.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }
                names.add(index, elementForDivide.substring(begin));
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", names));

    }

    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
