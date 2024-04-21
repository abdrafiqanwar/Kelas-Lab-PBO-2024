package Inheritance;

public class Vehicle {
    String brand;
    double price;

    void start(){
        System.out.println("Start");
    }


    public static void main(String[] args) {
        Car car = new Car("Tesla", 1000, 10);
        car.start();
        car.brake();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("vespa", 2000, 60);
        motorcycle.start();
        motorcycle.accelerate();

        System.out.println();

        Truck truck = new Truck("bus", 3000, 20);
        truck.start();
        truck.load();
    }
}

class Car extends Vehicle{
    
    Car(String brand, double price, int numDoors){
        this.brand = brand;
        this.price = price;
        this.numDoors = numDoors;
    }

    int numDoors;

    void brake(){
        System.out.println("numDoors " + numDoors);
    }
}

class Motorcycle extends Vehicle{

    Motorcycle(String brand, double price, int engineCapacity){
        this.brand = brand;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    int engineCapacity;

    void accelerate(){
        System.out.println("Engine Capacity " + engineCapacity);
    }
}

class Truck extends Vehicle{

    Truck(String brand, double price, int loadCapacity){
        this.brand = brand;
        this.price = price;
        this.loadCapacity = loadCapacity;
    }

    int loadCapacity;

    void load(){
        System.out.println("Load Capacity " + loadCapacity);
    }
}
