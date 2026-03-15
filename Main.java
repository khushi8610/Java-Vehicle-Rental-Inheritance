class Vehicle {
    String brand;
    int modelYear;

    Vehicle(String brand, int modelYear) {
        this.brand = brand;
        this.modelYear = modelYear;
    }

    void start() {
        System.out.println("Vehicle started: " + brand + " " + modelYear);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int modelYear, int numberOfDoors) {
        super(brand, modelYear);
        this.numberOfDoors = numberOfDoors;
    }

    void drive() {
        System.out.println("Car is driving with " + numberOfDoors + " doors.");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int modelYear, int numberOfDoors, int batteryCapacity) {
        super(brand, modelYear, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    void charge(int percent) {
        System.out.println("Battery charged to " + percent + "%");
    }
}

public class Main {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar("Tesla", 2024, 4, 75);

        e.start();
        e.drive();
        e.charge(80);
    }
}