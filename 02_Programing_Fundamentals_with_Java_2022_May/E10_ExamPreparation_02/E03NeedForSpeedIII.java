package E10_ExamPreparation_02;

import java.util.*;

// https://judge.softuni.org/Contests/Practice/Index/2307#2
public class E03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carsInfo = scanner.nextLine().split("\\|");

            String car = carsInfo[0];
            int mileage = Integer.parseInt(carsInfo[1]);
            int fuel = Integer.parseInt(carsInfo[2]);

            carsMap.putIfAbsent(car, new ArrayList<>());
            carsMap.get(car).add(0, mileage);
            carsMap.get(car).add(1, fuel);

        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] data = input.split(" : ");
            String command = data[0];
            String car = data[1];

            int mileage = carsMap.get(car).get(0);
            int fuel = carsMap.get(car).get(1);


            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int currentFuel = Integer.parseInt(data[3]);
                    if (currentFuel <= fuel) {
                        carsMap.get(car).set(1, fuel - currentFuel);
                        carsMap.get(car).set(0, mileage + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, currentFuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    if (carsMap.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        carsMap.remove(car);
                    }
                    break;
                case "Refuel":
                    currentFuel = Integer.parseInt(data[2]);
                    if (fuel + currentFuel > 75) {
                        int fuelDifference = 75 - carsMap.get(car).get(1);
                        System.out.printf("%s refueled with %d liters%n", car, fuelDifference);
                        carsMap.get(car).set(1, 75);
                    } else {
                        carsMap.get(car).set(1, fuel + currentFuel);
                        System.out.printf("%s refueled with %d liters%n", car, currentFuel);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(data[2]);
                    if (mileage - kilometers < 10000) {
                        carsMap.get(car).set(0, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                        carsMap.get(car).set(0, mileage - kilometers);
                    }
                    break;

            }

            input = scanner.nextLine();
        }


        carsMap.forEach((key, value) ->
                        System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", key, value.get(0), value.get(1))
                );

    }
}
