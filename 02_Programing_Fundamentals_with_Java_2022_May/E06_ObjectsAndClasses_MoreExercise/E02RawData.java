package E06_ObjectsAndClasses_MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E02RawData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        List<Engine> engines = new ArrayList<>();
        List<Cargo> cargos = new ArrayList<>();
        List<Tires> tires = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Car car;
            Engine engine;
            Cargo cargo;
            Tires tire;
            String[] inputData = scanner.nextLine().split("\\s+");
            String model = inputData[0];
            int speed = Integer.parseInt(inputData[1]);
            int power = Integer.parseInt(inputData[2]);
            int weight = Integer.parseInt(inputData[3]);
            String type = inputData[4];
            double tire1pressure = Double.parseDouble(inputData[5]);
            int tire1age = Integer.parseInt(inputData[6]);
            double tire2pressure = Double.parseDouble(inputData[7]);
            int tire2age = Integer.parseInt(inputData[8]);
            double tire3pressure = Double.parseDouble(inputData[9]);
            int tire3age = Integer.parseInt(inputData[10]);
            double tire4pressure = Double.parseDouble(inputData[11]);
            int tire4age = Integer.parseInt(inputData[12]);
            car = new Car(model);
            engine = new Engine(speed, power);
            cargo = new Cargo(weight, type);
            tire = new Tires(tire1pressure, tire1age, tire2pressure, tire2age, tire3pressure, tire3age, tire4pressure, tire4age);
            cars.add(car);
            engines.add(engine);
            cargos.add(cargo);
            tires.add(tire);

        }

        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            for (int i = 0; i < cars.size(); i++) {
                if (cargos.get(i).type.equals("fragile") && (tires.get(i).tire1pressure < 1 || tires.get(i).tire2pressure < 1 || tires.get(i).tire3pressure < 1 || tires.get(i).tire4pressure < 1)) {
                    System.out.println(cars.get(i).model);
                }
            }

        } else if (command.equals("flamable")) {
            for (int i = 0; i < cars.size(); i++) {
                if (engines.get(i).power > 250 && cargos.get(i).type.equals("flamable")) {
                    System.out.println(cars.get(i).model);
                }
            }
        }


//        "<Model>
//        <EngineSpeed> <EnginePower>
//        <CargoWeight> <CargoType>
//        <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure>
//        <Tire3Age> <Tire4Pressure> <Tire4Age>
        // where the speed, power, weight and tire age are integers, tire pressure is a double.

    }

//    The engine, cargo, and tire should be separate classes,
//    create a constructor that receives all information about the Car
//    and creates and initializes its inner components (engine, cargo, and tires).

    static class Car {
        String model;

        public Car(String model) {
            this.model = model;
        }
    }

    static class Engine {
        int speed;
        int power;

        public Engine(int speed, int power) {
            this.speed = speed;
            this.power = power;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

    }

    static class Cargo {
        int weight;
        String type;

        public Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    static class Tires {
        int tire1age;
        double tire1pressure;
        int tire2age;
        double tire2pressure;
        int tire3age;
        double tire3pressure;
        int tire4age;
        double tire4pressure;

        public Tires(double tire1pressure, int tire1age, double tire2pressure, int tire2age, double tire3pressure, int tire3age, double tire4pressure, int tire4age) {
            this.tire1age = tire1age;
            this.tire1pressure = tire1pressure;
            this.tire2age = tire2age;
            this.tire2pressure = tire2pressure;
            this.tire3age = tire3age;
            this.tire3pressure = tire3pressure;
            this.tire4age = tire4age;
            this.tire4pressure = tire4pressure;
        }

        public int getTire1age() {
            return tire1age;
        }

        public void setTire1age(int tire1age) {
            this.tire1age = tire1age;
        }

        public double getTire1pressure() {
            return tire1pressure;
        }

        public void setTire1pressure(double tire1pressure) {
            this.tire1pressure = tire1pressure;
        }

        public int getTire2age() {
            return tire2age;
        }

        public void setTire2age(int tire2age) {
            this.tire2age = tire2age;
        }

        public double getTire2pressure() {
            return tire2pressure;
        }

        public void setTire2pressure(double tire2pressure) {
            this.tire2pressure = tire2pressure;
        }

        public int getTire3age() {
            return tire3age;
        }

        public void setTire3age(int tire3age) {
            this.tire3age = tire3age;
        }

        public double getTire3pressure() {
            return tire3pressure;
        }

        public void setTire3pressure(double tire3pressure) {
            this.tire3pressure = tire3pressure;
        }

        public int getTire4age() {
            return tire4age;
        }

        public void setTire4age(int tire4age) {
            this.tire4age = tire4age;
        }

        public double getTire4pressure() {
            return tire4pressure;
        }

        public void setTire4pressure(double tire4pressure) {
            this.tire4pressure = tire4pressure;
        }
    }

}

