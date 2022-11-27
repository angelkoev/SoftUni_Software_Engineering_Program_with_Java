package E05_MidExam_26_June_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nameList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Report")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Blacklist":
                    String name = data[1];
                    if (nameList.contains(name)) {
                        int indexToBlacklist = nameList.indexOf(name);
                        nameList.set(indexToBlacklist, "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", name);
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;

                case "Error":
                    int indexToCheck = Integer.parseInt(data[1]);
//                    if (isIndexValid(indexToCheck, nameList.size())) {
//                        if (!nameList.get(indexToCheck).equals("Lost")) {
//                            if (!nameList.get(indexToCheck).equals("Blacklisted")) {
//                                String tempName = nameList.get(indexToCheck);
//                                nameList.set(indexToCheck, "Lost");
//                                System.out.printf("%s was lost due to an error.%n", tempName);
//                            }
//                        }
//                    }
                    if (isIndexValid(indexToCheck, nameList.size())
                            && !nameList.get(indexToCheck).equals("Lost")
                            && !nameList.get(indexToCheck).equals("Blacklisted")) {
                        String tempName = nameList.get(indexToCheck);
                        nameList.set(indexToCheck, "Lost");
                        System.out.printf("%s was lost due to an error.%n", tempName);
                    }


                    break;
                case "Change":

                    indexToCheck = Integer.parseInt(data[1]);
                    String newName = data[2];
                    if (isIndexValid(indexToCheck, nameList.size())) {
                        String tempName = nameList.get(indexToCheck);
                        nameList.set(indexToCheck, newName);
                        System.out.printf("%s changed his username to %s.%n", tempName, newName);
                    }
                    break;
            }


            input = scanner.nextLine();
        }


        int countBlacklisted = 0;
        int countLost = 0;

        for (String name : nameList) {
            if (name.equals("Blacklisted")) {
                countBlacklisted++;
            } else if (name.equals("Lost")) {
                countLost++;
            }
        }

        System.out.printf("Blacklisted names: %d%n", countBlacklisted);
        System.out.printf("Lost names: %d%n", countLost);

        System.out.println(String.join(" ", nameList));

    }

    public static boolean isIndexValid(int index, int size) {
        return index >= 0 && index < size;
    }
}
