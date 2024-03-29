package E10_FinalExamRetake02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// https://judge.softuni.org/Contests/Practice/Index/2518#2
public class E03PlantDiscovery_Veronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, Double> rateMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plantRarityMap.putIfAbsent(plant, 0);
            rateMap.putIfAbsent(plant, 0.0);

            plantRarityMap.put(plant, rarity);
        }

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Exhibition")) {
            String[] tokens = inputLine.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            if (!rateMap.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double currentRate = Double.parseDouble(tokens[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, currentRate);
                        } else {
                            double newRate = (rateMap.get(plant) + currentRate) / 2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(tokens[2]);
                        plantRarityMap.put(plant, newRarity);
                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);
                        break;
                    default:
                        System.out.println("error");
                }
            }

            inputLine = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantRarityMap.entrySet()
                .stream()
//                .sorted((p1, p2) -> {
//                    int result = p2.getValue() - p1.getValue();
//
//                    //asd -> 10 -> rate 70
//                    //veronika -> 10 -> rate 100
//                    if (result == 0) {
//                        //70 - 100
//                        double res = (rateMap.get(p2.getKey()) - rateMap.get(p1.getKey()));
//                        return (int)res;
//                    }
//                    return result;
//                })
                .forEach(entry -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                            entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
                });
    }
}