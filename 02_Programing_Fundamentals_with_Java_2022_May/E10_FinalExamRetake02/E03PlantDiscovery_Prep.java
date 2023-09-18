package E10_FinalExamRetake02;

import java.util.*;

public class E03PlantDiscovery_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plant> plantsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("<->");

            String plantName = info[0];
            int rarity = Integer.parseInt(info[1]);
            if (plantsMap.containsKey(plantName)) {
                Plant currentPlant = plantsMap.get(plantName);
                currentPlant.setRarity(rarity);
            } else {
                Plant currentPlant = new Plant(plantName, rarity);
                plantsMap.put(plantName, currentPlant);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] data = input.split(": ");
            String command = data[0];
            String nameAndValue = data[1];

            switch (command) {
                case "Rate":
                    String name = nameAndValue.split(" - ")[0];
                    if (plantsMap.containsKey(name)) {
                        double rating = Double.parseDouble(nameAndValue.split(" - ")[1]);
                        Plant currentPlant = plantsMap.get(name);
                        currentPlant.setRating(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    name = nameAndValue.split(" - ")[0];
                    if (plantsMap.containsKey(name)) {
                        int newRarity = Integer.parseInt(nameAndValue.split(" - ")[1]);
                        Plant currentPlant = plantsMap.get(name);
                        currentPlant.setRarity(newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    name = data[1];
                    if (plantsMap.containsKey(name)) {
                        Plant currentPlant = plantsMap.get(name);
                        currentPlant.resetRating();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantsMap.values().forEach(System.out::println);

    }

    public static class Plant {
        private String name;
        private int rarity;
        private List<Double> rating;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.rating = new ArrayList<>();
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void setRating(double rating) {
            this.rating.add(rating);
        }

        public void resetRating() {
            this.rating = new ArrayList<>();
        }

        public double average() {
            return rating.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        }

        @Override
        public String toString() {
            return String.format("- %s; Rarity: %s; Rating: %.2f", this.name, this.rarity, this.average());
        }
    }
}
