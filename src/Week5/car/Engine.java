package Week5.car;
public class Engine {
    String name;
    double horsePower;
    double capacity;
    boolean isStarted = false;

    public Engine (String name, double horsePower, double capacity){
        this.name = name;
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    public void StartEngine(){
        if (isStarted){
            isStarted = false;
            System.out.println("Engine turned off.");
        } else {
            isStarted = true;
            System.out.println("Engine turned on.");
        }
    }

}
