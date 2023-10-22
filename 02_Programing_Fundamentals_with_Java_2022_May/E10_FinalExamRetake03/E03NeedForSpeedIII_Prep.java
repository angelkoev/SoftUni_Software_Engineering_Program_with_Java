package E10_FinalExamRetake03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E03NeedForSpeedIII_Prep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\|");
            String name = info[0];
            int mileage = Integer.parseInt(info[1]);
            int fuel = Integer.parseInt(info[2]);
            Car currentCar = new Car(name, mileage, fuel);
            carsMap.put(name, currentCar);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] data = input.split(" : ");
            String command = data[0];
            String name = data[1];
            Car currentCar = carsMap.get(name);

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int fuel = Integer.parseInt(data[3]);
                    if (currentCar.getFuel() >= fuel) {
                        currentCar.setFuel(currentCar.getFuel() - fuel);
                        currentCar.setMileage(currentCar.getMileage() + distance);
                        System.out.printf("%s driven for %s kilometers. %s liters of fuel consumed.%n", name, distance, fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (currentCar.getMileage() >= 100000) {
                        carsMap.remove(name);
                        System.out.println("Time to sell the " + name + "!");
                    }
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(data[2]);
                    int oldAmount = currentCar.getFuel();
                    currentCar.setFuel(Math.min(oldAmount + fuel, 75));
                    System.out.printf("%s refueled with %s liters%n", name, currentCar.getFuel() - oldAmount);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(data[2]);
                    if ((currentCar.getMileage() - kilometers) < 10000) {
                        currentCar.setMileage(10000);
                    } else {
                        currentCar.setMileage(currentCar.getMileage() - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", name, kilometers);
                    }
                    break;

            }

            input = scanner.nextLine();
        }

        carsMap.values().forEach(System.out::println);

    }

    public static class Car {
        private String name;
        private int mileage;
        private int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", this.name, this.mileage, this.fuel);
        }
    }
}
