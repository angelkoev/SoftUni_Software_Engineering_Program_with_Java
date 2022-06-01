import java.util.Scanner;

public class E02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalkPerDay = Integer.parseInt(scanner.nextLine());
        int walksPerDay = Integer.parseInt(scanner.nextLine());
        int ccalPerDay = Integer.parseInt(scanner.nextLine());

        int burnedcCals = minutesWalkPerDay * walksPerDay * 5;

        double diff = Math.abs(ccalPerDay - burnedcCals);

        if (burnedcCals >= ccalPerDay * 0.5) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedcCals);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedcCals);
        }




    }
}
