import java.util.Scanner;

public class E05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wMeters = Double.parseDouble(scanner.nextLine());  //duljina na zalata v metri
        double hMeters = Double.parseDouble(scanner.nextLine());  //shirochina na zalata v metri

        double wCm = wMeters * 100;  //duljina na zalata v cm
        double hCm = hMeters * 100;  //shirochinata na zalata v cm

        double countWorkH = (hCm - 100) / 70; //broi na rabotnite mesta na shirochina, kato predi tova vadim koridora
        int countWorkHint = (int) countWorkH; //vzimame samo cialata chast ot poluchenoto chislo
//        System.out.println(countWorkHint);

        double countWorkW = wCm / 120;  // broi na rabotite mesta na duljina
        int countWorkWint = (int) countWorkW; //vzimame samo cialata chast ot poluchenoto chislo
//        System.out.println(countWorkWint);

        int result = countWorkWint * countWorkHint - 3; // broi na duljina * broi na shirochina - 3 (1 za vrata i 2 za katedrata)
        System.out.println(result);
    }
}
