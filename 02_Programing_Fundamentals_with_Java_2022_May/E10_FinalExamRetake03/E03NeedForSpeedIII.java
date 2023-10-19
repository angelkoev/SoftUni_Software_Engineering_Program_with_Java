package E10_FinalExamRetake03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carsInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String name = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            carsInfo.put(name, new Car(name, mileage, fuel));
        }

        String line = scanner.nextLine();

        while (!line.equals("Stop")) {
            String[] data = line.split(" : ");
            String command = data[0];
            String name = data[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int fuel = Integer.parseInt(data[3]);
                    drive(carsInfo.get(name), distance, fuel);
                    if (carsInfo.get(name).getMileage() >= 100000) {
                        System.out.printf("Time to sell the %s!%n", name);
                        carsInfo.remove(name);
                    }
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(data[2]);
                    revuel(carsInfo.get(name), fuel);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(data[2]);
                    revert (carsInfo.get(name), kilometers);

                    break;
            }

            line = scanner.nextLine();
        }

        carsInfo.values().forEach(System.out::println);
    }

    private static void revert(Car car, int kilometers) {
        if (car.getMileage() - kilometers > 10000) {
            car.setMileage(car.getMileage() - kilometers);
            System.out.printf("%s mileage decreased by %s kilometers%n", car.getName(), kilometers);
        } else {
            car.setMileage(10000);
        }
    }

    private static void revuel(Car car, int fuel) {
        if (car.getFuel() + fuel > 75) {
            fuel = 75 - car.getFuel();
            car.setFuel(75);
        } else {
            car.setFuel(car.getFuel() + fuel);
        }
        System.out.printf("%s refueled with %d liters%n", car.getName(), fuel);
    }

    private static void drive(Car car, int distance, int fuel) {
        if (fuel > car.getFuel()) {
            System.out.println("Not enough fuel to make that ride");
        } else {
            car.setMileage(car.getMileage() + distance);
            car.setFuel(car.getFuel() - fuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car.getName(), distance, fuel);
        }
    }


    static class Car {
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
