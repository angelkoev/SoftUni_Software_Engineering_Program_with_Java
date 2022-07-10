import java.util.Scanner;

public class E05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        String volume = scanner.nextLine();

        int loadedLugages = 0;

        while (!volume.equals("End")) {

            double luggageVolume = Double.parseDouble(volume);

            loadedLugages++;
            if (loadedLugages % 3 == 0) {
                capacity = capacity - luggageVolume * 1.1;
            } else {
                capacity = capacity - luggageVolume;
            }
            if (capacity <= 0) {
                System.out.printf("No more space!");
                System.out.println();
                loadedLugages--;
                break;

            }
                volume = scanner.nextLine();

        }

        if (capacity >= 0) {
            System.out.println("Congratulations! All suitcases are loaded!");
   }

        System.out.printf("Statistic: %d suitcases loaded.", loadedLugages);

    }
}
