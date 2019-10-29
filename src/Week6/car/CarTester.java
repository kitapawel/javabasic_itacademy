package Week6.car;

public class CarTester {
    public static void main(String[] args) {
        FuelCar fc1 = new FuelCar("Maluch", new Engine("SilnikMalucha", 800));
        fc1.tank();
    }
}
