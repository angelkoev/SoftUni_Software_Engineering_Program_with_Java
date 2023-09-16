package E10_FinalExamRetake02;

import java.util.*;

public class E03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityList = new LinkedHashMap<>();
        Map<String, Double> plantRatingList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("<->");
            String plant = data[0];
            int rarity = Integer.parseInt(data[1]);
            plantRarityList.putIfAbsent(plant, 0);
            plantRatingList.putIfAbsent(plant, 0.0);
            plantRarityList.put(plant, rarity);
        }

        String command = scanner.nextLine();

        while (!"Exhibition".equals(command)) {
            String[] data = command.split("[: -]+");
            String action = data[0];
            String plant = data[1];

            if (!plantRatingList.containsKey(plant)) {
                System.out.println("error");
            } else {

                switch (action) {
                    case "Rate":
//                    String rating = command.substring(command.indexOf(" - ") + 3, command.length());
//                  това го направих на стринг, за да наглася през дебъгера как точно да взима цифрите, иначе ми гърмеше с exception
                        double currentRateing = Double.parseDouble(data[2]);
                        if (plantRatingList.get(plant) == 0) {
                            plantRatingList.put(plant, currentRateing);
                        } else {
                            double newRate = (plantRatingList.get(plant) + currentRateing) / 2;
                            plantRatingList.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(data[2]);
                        plantRarityList.put(plant, newRarity);

                        break;
                    case "Reset":
//                        String plantToReset = command.substring(command.indexOf(":") + 2, command.length());
//                    if (!plantList.containsKey(plantToReset)) {
//                        System.out.println("error");
//                        continue;
//                        plantRatingList.remove(plantToReset);
                        plantRatingList.put(plant, 0.0);
                        break;
                    default:
                        System.out.println("error");
                }


            }
            command = scanner.nextLine();
        }

//        System.out.println("Plants for the exhibition:");

//        final OptionalDouble[] average_rating = new OptionalDouble[1];
//        plantRatingList.forEach((k, v) -> {
//            if (plantRatingList.containsKey(k))
//                average_rating[0] = plantRatingList.get(k).stream().mapToDouble(d -> d).average();
//            else average_rating[0] = OptionalDouble.of(0.00);
//            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", k, v, average_rating[0].getAsDouble());
//        });
        // TODO това принтиране ми е много объркано... и ще е проблем...

        System.out.println("Plants for the exhibition:");
        plantRarityList.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                            entry.getKey(), entry.getValue(), plantRatingList.get(entry.getKey()));
                });

    }
}
