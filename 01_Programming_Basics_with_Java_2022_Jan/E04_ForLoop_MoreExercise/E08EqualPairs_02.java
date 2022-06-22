import java.util.Scanner;
                        // решение от Mandarin(); и той се измъчи с тая задача
public class E08EqualPairs_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int oldValue = numberOne + numberTwo;
        int previousValue = 0;
        boolean allPairsAreEqual = true;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 2; i <= n; i++) {
            numberOne = Integer.parseInt(scanner.nextLine());
            numberTwo = Integer.parseInt(scanner.nextLine());
            int newValue = numberOne + numberTwo;
            if (oldValue != newValue){
                allPairsAreEqual = false;
            }
            int currentDifference = 0;
            if (i == 2){
                currentDifference = Math.abs(oldValue - newValue);
            } else {
                currentDifference = Math.abs(previousValue - newValue);
            }
            if (maxDiff < currentDifference){
                maxDiff = currentDifference;
            }
            previousValue = numberOne + numberTwo;
        }
        if (allPairsAreEqual){
            System.out.printf("Yes, value=%d", oldValue);
        }else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
