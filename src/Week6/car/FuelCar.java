package Week6.car;

public class FuelCar extends Car implements Tankable {

    public FuelCar(String name, Engine engine) {
        super(name, engine);
        System.out.println(name + "'s " + engine.getPower() + " horsepower engine says VROOOOM!");
    }

    public void tank(){
        System.out.println(this.getName() + " has been tanked.");
    }
}
