package Week5.transport;

public class Motorbike extends Vehicle {
    int engineSize;

    public Motorbike(String brand, String name, int noOfWheels, int noOfPassangers, int engineSize) {
        super(brand, name, noOfWheels, noOfPassangers);
        this.engineSize = engineSize;
    }
}
