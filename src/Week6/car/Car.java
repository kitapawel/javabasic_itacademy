package Week6.car;

import java.util.Objects;

public class Car implements Cloneable {
    private String name;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return name.equals(car.name) && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine);
    }

    @Override
    public String toString() {
        return "Car " + name + ", " + engine.getName();
    }

    @Override
    protected Car clone() throws CloneNotSupportedException{
        return (Car) super.clone();
    }
}
