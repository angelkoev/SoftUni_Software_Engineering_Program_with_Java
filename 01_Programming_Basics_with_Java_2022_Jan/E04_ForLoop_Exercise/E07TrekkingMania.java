import java.util.Scanner;

public class E07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int allPeople = 0;

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 1; i <= groups; i++) {
            int peopleInGroups = Integer.parseInt(scanner.nextLine());

            allPeople = allPeople + peopleInGroups;
            if (peopleInGroups <6) { //<=5
                p1 = p1 + peopleInGroups;
            } else if (peopleInGroups <13) {  // <=12
                p2 = p2 + peopleInGroups;
            } else if (peopleInGroups <26) { // <=25
                p3 = p3 + peopleInGroups;
            } else if (peopleInGroups <41) { // <=40
                p4 = p4 + peopleInGroups;
            } else {
                p5 = p5 + peopleInGroups;
            }

        }

        System.out.printf("%.2f%%%n", p1*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", p2*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", p3*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", p4*1.0/allPeople*100);
        System.out.printf("%.2f%%%n", p5*1.0/allPeople*100);

    }
}
