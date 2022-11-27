package E05_MidExam_26_June_2022;

import java.util.Scanner;

// 90/100

//            pri schupeno Blacklisted, test 5 gurmi...
//            pri shcupeno Lost, test 10 gurmi... i 6 ti...
//            toest tochno v tiaa proveria e...
//            blacklisted... ako ne se proveri - gurmiat 5 i 10
//            lost... ako ne se proveri - gurmiat 6 i 10
//            ako ne se proveriat i 2te... gurmiat 5, 6 i 10
//            ako ne se proveri validnostta na index-a... gurmiat 9 i 10
//            kato 9 e s runtime error



public class E02_FriendListMaintenance_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friendList = scanner.nextLine().split(", ");

        String input = scanner.nextLine();

        boolean nameFound = false;
        boolean alreadyLost = false;

        while (!input.equals("Report")) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Blacklist":
                    String name = data[1];
                    for (int i = 0; i < friendList.length; i++) {
                        if (friendList[i].equals(name)) {
                            friendList[i] = "Blacklisted";
                            System.out.printf("%s was blacklisted.%n", name);
                            nameFound = true;
                        }
                    }
                    if (!nameFound) {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;
                case "Error":

//                    int indexToCheck = Integer.parseInt(data[1]);
//                    if (isIndexValid(indexToCheck, friendList.length)) {
//                        if (!friendList[indexToCheck].equals("Blacklisted")) {
//                            if (!friendList[indexToCheck].equals("Lost")) {
//                                String tempName = friendList[indexToCheck];
//                                friendList[indexToCheck] = "Lost";
//                                System.out.printf("%s was lost due to an error.%n", tempName);
//                            }
//                        }
//                    }

//                    int indexToCheck = Integer.parseInt(data[1]);
//
//                    if (isIndexValid(indexToCheck, friendList.length)) {
//                        if (!friendList[indexToCheck].equals("Blacklisted") || !friendList[indexToCheck].equals("Lost")) {
//                                String tempName = friendList[indexToCheck];
//                                System.out.printf("%s was lost due to an error.%n", tempName);
//                                friendList[indexToCheck] = "Lost";
//                            }
//                        }

                    int indexToCheck = Integer.parseInt(data[1]);
//                    if (isIndexValid(indexToCheck, friendList.length)) {
//                        if (!friendList[indexToCheck].equals("Lost")) {
//                            if (!friendList[indexToCheck].equals("Blacklisted")) {
//                                String tempName = friendList[indexToCheck];
//                                friendList[indexToCheck] = "Lost";
//                                System.out.printf("%s was lost due to an error.%n", tempName);
//                            }
//                        }
//                    }
                    if (isIndexValid(indexToCheck, friendList.length)
                            && !friendList[indexToCheck].equals("Lost")
                            && !friendList[indexToCheck].equals("Blacklisted")) {
                        String tempName = friendList[indexToCheck];
                        friendList[indexToCheck] = "Lost";
                        System.out.printf("%s was lost due to an error.%n", tempName);
                    }

                    break;
                case "Change":
                    indexToCheck = Integer.parseInt(data[1]);
                    String newName = data[2];
                    if (isIndexValid(indexToCheck, friendList.length)) {
                        String tempName = friendList[indexToCheck];
                        friendList[indexToCheck] = newName;
                        System.out.printf("%s changed his username to %s.%n", tempName, newName);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        int blackListedCount = 0;
        int lostCount = 0;

        for (int i = 0; i < friendList.length; i++) {
            if (friendList[i].equals("Blacklisted")) {
                blackListedCount++;
            } else if (friendList[i].equals("Lost")) {
                lostCount++;
            }
        }

        System.out.printf("Blacklisted names: %d%n", blackListedCount);
        System.out.printf("Lost names: %d%n", lostCount);

        System.out.println(String.join(" ", friendList));

//        for (int i = 0; i < friendList.length; i++) {
//            System.out.print(friendList[i]);
//            if (i != friendList.length - 1) {
//                System.out.print(" ");
//            }
//        }
    }

    public static boolean isIndexValid(int index, int size) {
        return 0 <= index && index < size;
    }

}
