package E05_MidExam_26_June_2022;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class test_angry_cat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRatingList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItem = scanner.nextLine();

        int rightSum = 0;
        int leftSum = 0;
        int compEP = priceRatingList.get(entryPoint);
        if (typeOfItem.equals("cheap")) {
            for (int i = entryPoint + 1; i <= priceRatingList.size() - 1; i++) {
                if (compEP > priceRatingList.get(i)) {
                    rightSum += priceRatingList.get(i);
                }
            }
            for (int i = entryPoint - 1; i >= 0; i--) {
                if (compEP > priceRatingList.get(i)) {
                    leftSum += priceRatingList.get(i);
                }
            }
        }

        if (typeOfItem.equals("expensive")) {
            for (int i = entryPoint + 1; i <= priceRatingList.size() - 1; i++) {
                if (compEP <= priceRatingList.get(i)) {
                    rightSum += priceRatingList.get(i);
                }
            }
            for (int i = entryPoint - 1; i >= 0; i--) {
                if (compEP <= priceRatingList.indexOf(i)) {
                    leftSum += priceRatingList.get(i);
                }
            }
        }
        System.out.println();
        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }
    }
}
