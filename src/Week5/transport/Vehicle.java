package Week5.transport;

public abstract class Vehicle {
    String brand;
    String name;
    int noOfWheels;
    int noOfPassangers;

    public Vehicle(String brand, String name, int noOfWheels, int noOfPassangers) {
        this.brand = brand;
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.noOfPassangers = noOfPassangers;
    }
}
