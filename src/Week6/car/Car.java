package Week6.car;

public class Car {
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
}
