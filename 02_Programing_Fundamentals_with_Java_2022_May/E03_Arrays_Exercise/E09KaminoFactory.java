package E03_Arrays_Exercise;

import java.util.Scanner;
// https://www.youtube.com/watch?v=B3cyEr5fBuo

public class E09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int bestDnaPosition = 0;
        int maxLength = 0;
        int maxSum = 0;
        String bestLocalDna = "";
        int countDna = 0;
        int bestCountDna = 0;
        String[] bestDna = new String[n];

        while (!input.equals("Clone them!")) {
            countDna++;
            String data = input.replaceAll("!", ""); // заместваме ! със space
            // 10110 -> [1,11]
            String[] dna = data.split("0");
            int currentLength = 0;
            int currentSum = 0;
            int currentPosition = 0;
            for (int i = 0; i < dna.length; i++) {
                currentSum += dna[i].length();
                if (dna[i].length() > currentLength) {
                    currentLength = dna[i].length();
                    bestLocalDna = dna[i];
                }
            }
            currentPosition = data.indexOf(bestLocalDna);

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxSum = currentSum;
                bestDnaPosition = currentPosition;
                bestCountDna = countDna;
                bestDna = data.split("");
            } else if (currentLength == maxLength && (bestDnaPosition > currentPosition || currentSum > maxSum)) {
                maxLength = currentLength;
                maxSum = currentSum;
                bestDnaPosition = currentPosition;
                bestCountDna = countDna;
                bestDna = data.split("");
            } else if (countDna == 1) {
                maxLength = currentLength;
                maxSum = currentSum;
                bestDnaPosition = currentPosition;
                bestCountDna = countDna;
                bestDna = data.split("");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", bestCountDna, maxSum );
        System.out.println(String.join(" ", bestDna));

    }
}
