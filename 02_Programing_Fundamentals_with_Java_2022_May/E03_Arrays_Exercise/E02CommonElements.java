package E03_Arrays_Exercise;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] row1 = scanner.nextLine().split("\\s+");
        String[] row2 = scanner.nextLine().split("\\s+");

        for (String second : row1) {
            for (String first : row2) {
                if (second.equals(first)) {
                    System.out.print(second + " ");
                }
            }
        }

//        for (int i = 0; i < row2.length; i++) {
//            for (int j = 0; j < row1.length; j++) {
//                if (row2[i].equals(row1[j])) {
//                    System.out.print(row2[i] + " ");
//                }
//            }
//        }

    }
}
