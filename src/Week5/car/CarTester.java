package Week5.car;

public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car ("Porshe", 50);
        Engine e1 = new Engine("GT", 140, 1800);
        c1.engine = e1;

        c1.engine.StartEngine();
        c1.engine.StartEngine();
    }
}
