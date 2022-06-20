import java.util.Scanner;

public class E02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int countDoctors = 7;
        int threatedPatients = 0;
        int unthreatedPatients = 0;

        for (int i = 1; i <= period ; i++) {
            int pacients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && unthreatedPatients > threatedPatients) {
                    countDoctors++;
            }
            if (pacients <= countDoctors) {
                threatedPatients = threatedPatients + pacients;
            } else {
                int diff = pacients - countDoctors;
                unthreatedPatients = unthreatedPatients + diff;
                threatedPatients = threatedPatients + countDoctors;
            }
        }

        System.out.printf("Treated patients: %d.", threatedPatients);
        System.out.println();
        System.out.printf("Untreated patients: %d.", unthreatedPatients);

    }
}
