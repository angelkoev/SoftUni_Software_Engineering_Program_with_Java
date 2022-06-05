import java.util.Scanner;

public class E12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double percentage = 0.0;

        if (sales >= 0 && sales <= 500) {
            switch (city) {
                case "Sofia":
                    percentage = 0.05;
                    break;
                case "Varna":
                    percentage = 0.045;
                    break;
                case "Plovdiv":
                    percentage = 0.055;
                    break;
                default:
                    percentage = 0.00;
                    break;
            }
        }
        if (sales > 500 && sales <= 1000) {
            switch (city) {
                case "Sofia":
                    percentage = 0.07;
                    break;
                case "Varna":
                    percentage = 0.075;
                    break;
                case "Plovdiv":
                    percentage = 0.08;
                    break;
                default:
                    percentage = 0.00;
                    break;
            }
        }
        if (sales > 1000 && sales <= 10000) {
            switch (city) {
                case "Sofia":
                    percentage = 0.08;
                    break;
                case "Varna":
                    percentage = 0.10;
                    break;
                case "Plovdiv":
                    percentage = 0.12;
                    break;
                default:
                    percentage = 0.00;
                    break;
            }
        }
        if (sales > 10000) {
            switch (city) {
                case "Sofia":
                    percentage = 0.12;
                    break;
                case "Varna":
                    percentage = 0.13;
                    break;
                case "Plovdiv":
                    percentage = 0.145;
                    break;
                default:
                    percentage = 0.00;
                    break;
            }
        }


        if (percentage == 0.0) {
            System.out.println("error");
        } else {
            double result = percentage * sales;
            System.out.printf("%.2f", result);
        }


    }
}
