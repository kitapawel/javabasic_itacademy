package Week5;

public class Pet extends Animal {

    public void makeSound(){
        System.out.println(name + " goes mrglglglglg");
    }

    @Override
    public void runAway() {
        System.out.println(name + " AAAAAAAAAA");
    }

    @Override
    public void chase(Animal animal) {
        System.out.println(this.name + " is chasing " + animal.name);
    }
}
