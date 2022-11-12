package E05_Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class E06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + "." + products.get(i));
        }

    }
}
