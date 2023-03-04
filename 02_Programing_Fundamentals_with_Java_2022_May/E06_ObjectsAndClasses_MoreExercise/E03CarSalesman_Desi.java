package E06_ObjectsAndClasses_MoreExercise;

//import java.util.Scanner;
//
//public class E03CarSalesman {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//    }
//}

// първата закоментирана част е моя, другата е от решение на Desi

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03CarSalesman_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Engine engine;
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            //2 parameters
            if (input.length == 2) {
                engine = new Engine(model, power);
            }
            //4 parameters
            else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            }
            //3 parameters
            else {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            }

            engines.add(engine);
        }


        int m = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car;
            String model = input[0];
            String engineModel = input[1];

            if (input.length == 2) {
                car = new Car(model, engineModel);
            } else if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                car = new Car(model, engineModel, weight, color);
            } else {
                try {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(model, engineModel, weight);
                } catch (NumberFormatException e) {
                    String color = input[2];
                    car = new Car(model, engineModel, color);
                }
            }

            cars.add(car);
        }


        //лист с коли
        //лист с двигатели

        //FordFocus:
        //V4-33:
        //Power: 140
        //Displacement: 28
        //Efficiency: B
        //Weight: 1300
        //Color: Silver

        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngineModel() + ":");
            engines.forEach(engine -> {
                        if (engine.getModel().equals(car.getEngineModel())) {
                            System.out.println(engine.toString());
                        }
                    }
            );
            if(car.getWeight() == 0) {
                System.out.println("Weight: n/a");
            } else {
                System.out.println("Weight: " + car.getWeight());
            }
            System.out.println("Color: " + car.getColor());
        }


    }

    static class Car {
        //model, engine, weight and color
        private String model;
        private String engineModel;
        //optional
        private int weight;
        private String color;

        //1. начин -> model, engineModel
        //2. начин -> model, engineModel, weight, color
        //3. начин -> model, engineModel, weight
        //3. начин -> model, engineModel, color

        public Car (String model, String engineModel) {
            this.model = model;
            this.engineModel = engineModel;
            this.weight = 0;
            this.color = "n/a";
        }

        public Car (String model, String engineModel, int weight, String color) {
            this(model, engineModel);
            this.weight = weight;
            this.color = color;
        }

        public Car (String model, String engineModel, int weight) {
            this(model, engineModel);
            this.weight = weight;
            this.color = "n/a";
        }

        public Car (String model, String engineModel, String color) {
            this(model, engineModel);
            this.color = color;
            this.weight = 0;
        }

        public String getModel() {
            return this.model;
        }

        public String getEngineModel() {
            return this.engineModel;
        }

        public int getWeight() {
            return this.weight;
        }

        public String getColor() {
            return this.color;
        }

        public static String getFullName() {
            return "Test";
        }
    }
    static class Engine {
        //model, power, displacement and efficiency
        private String model;
        private int power;
        //optional
        private int displacement;
        private String efficiency;
        //1. начин -> model, power
        //2. начин -> model, power,displacement
        //3.начин -> model, power, efficiency
        //4. начин -> model, power, displacement, efficiency

        public Engine (String model, int power) {
            this.model = model;
            this.power = power;
            this.displacement = 0;
            this.efficiency = "n/a";

        }

        public Engine (String model, int power, int displacement) {
            this(model, power);
            this.displacement = displacement;
            this.efficiency = "n/a";
        }

        public Engine (String model, int power, String efficiency) {
            this(model, power);
            this.efficiency = efficiency;
            this.displacement = 0;
        }

        public Engine (String model, int power, int displacement, String efficiency) {
            this(model, power);
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        public String getModel() {
            return this.model;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Power: " + this.power + "\n");
            if(this.displacement == 0) {
                stringBuilder.append("Displacement: n/a" + "\n");
            } else {
                stringBuilder.append("Displacement: " + this.displacement + "\n");
            }
            stringBuilder.append("Efficiency: " + this.efficiency);
            return stringBuilder.toString();
        }
    }

}
