package Week6.car;

public class CarTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        FuelCar fc1 = new FuelCar("Maluch", new Engine("SilnikF126", 30));
        fc1.tank();
        FuelCar fc2 = new FuelCar("Duży Fiat", new Engine("SilnikF125", 50));
        fc1.tank();
        FuelCar fc3 = new FuelCar("Duży Fiat", new Engine("SilnikF125", 50));
        fc1.tank();
        ElectricCar ec1 = new ElectricCar("Tesla", new Engine("SilnikTesla", 470));
        ec1.charge();
        Hybrid hc1 = new Hybrid("Chevrolet Volt", new Engine("SilnikVolt", 84));
        hc1.charge();
        hc1.tank();
        System.out.println(ec1.getClass());
        System.out.println(hc1.getClass());
        System.out.println(fc1.getClass());

        if (fc2.equals(fc3)){
            System.out.println(fc2 + " equals " + fc3);
        } else {
            System.out.println(fc2 +" not equals " + fc3);
        }

        FuelCar fc4 = fc3;

        if (fc3.equals(fc4)){
            System.out.println(fc3 + " equals " + fc4);
        } else {
            System.out.println(fc3 +" not equals " + fc4);
        }

        System.out.println("fc1's hash: " + fc1.hashCode());
        System.out.println("fc2's hash: " + fc2.hashCode());
        System.out.println("fc3's hash: " + fc3.hashCode());
        System.out.println("fc4's hash: " + fc4.hashCode());

        FuelCar fc1c = (FuelCar) fc1.clone();
        System.out.println("fc1c has been cloned, its hash: " + fc1c.hashCode());
        FuelCar fc4c = (FuelCar) fc4.clone();
        System.out.println("fc4c has been cloned, its hash: " + fc4c.hashCode());
        
        Car[] cars = new Car[8];
        cars[0] = fc1;
        cars[1] = fc2;
        cars[2] = fc3;
        cars[3] = fc4;
        cars[4] = fc1c;
        cars[5] = fc4c;
        cars[6] = ec1;
        cars[7] = hc1;

        for (Car car : cars) {
            if (car instanceof Tankable && car instanceof Chargeable){
                ((Chargeable) car).charge();
                ((Tankable) car).tank();
            } else if (car instanceof Chargeable){
                ((Chargeable) car).charge();
            } else {
                ((Tankable) car).tank();
            }
        }
    }
}
