package Week6.car;

public class ElectricCar extends Car implements Chargeable {

    public ElectricCar(String name, Engine engine) {
        super(name, engine);
        System.out.println(name + "'s " + engine.getPower() + " horsepower engine says WHIZZZZ!");
    }

    @Override
    public void charge() {
        System.out.println(this.getName() + " has been charged.");
    }
}
