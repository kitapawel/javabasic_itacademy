package Week5.car;

public class Car {
    String name;
    Engine engine;
    double fuelCap;
    double remainingFuel;

    public Car (String name, double fuelCap){
        this.name = name;
        this.fuelCap = fuelCap;
        System.out.println("Created car: " + name + " " + fuelCap);
    }

    public void Drive(){
        if (engine.isStarted){

        } else {
            System.out.println("Cannot drive. Start the engine first.");
        }
    }

}
