package Week6.car;

import java.util.Objects;

public class Engine implements Cloneable{

    private String name;
    private int power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        return name.equals(engine.name) && power == engine.power; // wrappers compared via equals and primitives (int) compared via ==
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }

    @Override
    public String toString() {
        return "Engine " + name;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException{
       return (Engine) super.clone();
    }

}
