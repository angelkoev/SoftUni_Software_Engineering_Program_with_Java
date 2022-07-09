import java.util.Scanner;

public class E05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;


        for (int i = 1; i <= count; i++) {
            String product = scanner.nextLine();
            switch (product) {
                case "Back":
                    p1++;
                    break;
                case "Chest":
                    p2++;
                    break;
                case "Legs":
                    p3++;
                    break;
                case "Abs":
                    p4++;
                    break;
                case "Protein shake":
                    p5++;
                    break;
                case "Protein bar":
                    p6++;
                    break;
            }
        }

        int totalworkOut = p1 + p2 + p3 + p4;
        int totalProtein = p5 + p6;

        System.out.printf("%d - back%n", p1);
        System.out.printf("%d - chest%n", p2);
        System.out.printf("%d - legs%n", p3);
        System.out.printf("%d - abs%n", p4);
        System.out.printf("%d - protein shake%n", p5);
        System.out.printf("%d - protein bar%n", p6);
        System.out.printf("%.2f%% - work out%n", totalworkOut * 1.0 / count * 100);
        System.out.printf("%.2f%% - protein", totalProtein * 1.0 / count * 100);

    }
}
