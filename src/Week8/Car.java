package Week8;

public class Car {
    private double fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void go(int kilometers) throws EmptyTankException {
        if(kilometers * 0.05 <= fuel) {
            System.out.println("Cars has been driven for " + kilometers);
            fuel = fuel - kilometers * 0.05;
        } else {
            throw new EmptyTankException("We have no enough fuel to go. Remaining fuel: " + fuel);
        }
    }

    public void tank(int fuel) {
        this.fuel += fuel;
    }
}
