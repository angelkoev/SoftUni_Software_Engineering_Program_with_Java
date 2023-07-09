package E09_RegularExpressions_Exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile(">{2}(?<name>\\w+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)");

        List<String> purchases = new LinkedList<>();
        Double totalMoney = 0.0;

        while (!line.equals("Purchase")) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String name = matcher.group("name");
                Double price = Double.parseDouble(matcher.group("price"));
                Double quantity = Double.parseDouble(matcher.group("quantity"));
                purchases.add(name);
                totalMoney += price * quantity;
            }

            line = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        purchases.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalMoney);


    }
}