import java.util.Scanner;

public class E01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int totalTimeSec = time1 + time2 + time3;

        int mimutes = totalTimeSec / 60;
        int seconds = totalTimeSec % 60;


//        if (seconds < 10) {
//            System.out.printf("%d:0%d", mimutes, seconds);
//        } else {
//            System.out.printf("%d:%d", mimutes, seconds);
//        }

        System.out.printf("%d:%02d", mimutes, seconds);

//      shablon -> %02d = iskam da imam 2 cifri, kato ako e samo 1, sloji otpred 0
//      primerno %06d = obshto 6 cifri, ako chisloto e s po-malko ot 6 znaka, zamesti praznite s 0
//      tova ne raboti pri %f, toest ne raboti za double
    }
}
