package E06_ObjectsAndClasses_Lab;

import java.util.Date;

public class E_CalculateMiliSecondsForOperations {
    public static void main(String[] args) {
        int x = 0;
        Date start = new Date();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < Integer.MAX_VALUE; j++) {
                x *= i;
            }
        }
        Date end = new Date();

        System.out.println(end.getTime() - start.getTime());

        System.out.println(x);
    }
}
