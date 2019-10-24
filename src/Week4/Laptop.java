package Week4;
public class Laptop {

    public Laptop (String brand, int weight, String cpu){
        this.brand = brand;
        this.weight = weight;
        this.cpu = cpu;
    }

    public Laptop(){

    }

    String brand;
    String cpu;
    int weight;
    static boolean isOn = false;

    public static void main(String[] args) {
        Laptop mcBook = new Laptop("Mac", 2,"2.4");
    /*    mcBook.brand = "Mac";
        mcBook.cpu = "2.3";*/
        mcBook.switchOn();
        mcBook.checkPower();
        mcBook.switchOff();
        mcBook.checkPower();
        Laptop assus = new Laptop();
        assus.brand = "Asus";
        assus.cpu = "2.3";
        assus.switchOn();
        assus.checkPower();
        assus.switchOff();
        assus.checkPower();
    }

    public void switchOn(){
        isOn = true;
    }

    public void switchOff(){
        isOn = false;
    }

    public void checkPower(){
        System.out.println("The computer " +brand + " is on: "+ isOn);
    }

}