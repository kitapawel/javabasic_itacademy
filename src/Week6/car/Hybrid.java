package Week6.car;

public class Hybrid extends Car implements Chargeable, Tankable {

    public Hybrid(String name, Engine engine) {
        super(name, engine);
        System.out.println(name + "'s " + engine.getPower() + " horsepower engine says WHOOSHWROOOM!");
    }

    @Override
    public void charge() {
        System.out.println(this.getName() + " has been charged.");
    }

    @Override
    public void tank() {
        System.out.println(this.getName() + " has been tanked.");
    }
}
