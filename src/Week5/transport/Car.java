package Week5.transport;

public class Car extends Vehicle {
    int engineSize;

    public Car(String brand, String name, int noOfWheels, int noOfPassangers, int engineSize) {
        super(brand, name, noOfWheels, noOfPassangers);
        this.engineSize = engineSize;
    }
}
