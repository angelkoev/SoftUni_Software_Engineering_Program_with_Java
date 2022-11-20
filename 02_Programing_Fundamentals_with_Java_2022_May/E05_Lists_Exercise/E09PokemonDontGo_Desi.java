package E05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E09PokemonDontGo_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distancesPokemons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (distancesPokemons.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distancesPokemons.size() - 1) {
                int removedElement = distancesPokemons.get(index);
                sum += removedElement;
                distancesPokemons.remove(index);
                changelElements(distancesPokemons, removedElement);
            } else if (index < 0) {
                int removedElementFirst = distancesPokemons.get(0);
                sum += removedElementFirst;
                int lastElement = distancesPokemons.get(distancesPokemons.size() - 1);
                distancesPokemons.set(0, lastElement);
                 changelElements(distancesPokemons, removedElementFirst);
            } else if (index > distancesPokemons.size() - 1) {
                int removedElementLast = distancesPokemons.get(distancesPokemons.size() - 1);
                sum += removedElementLast;
                int firstElement = distancesPokemons.get(0);
                distancesPokemons.set(distancesPokemons.size() - 1, firstElement);
                changelElements(distancesPokemons, removedElementLast);
            }
        }

        System.out.println(sum);

    }

    private static void changelElements(List<Integer> distancesPokemons, int removedElement) {
        for (int i = 0; i <= distancesPokemons.size() - 1; i++) {
            int currentNumber = distancesPokemons.get(i);

            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            distancesPokemons.set(i, currentNumber);
        }
    }
}
