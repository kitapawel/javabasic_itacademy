package Week5;

public class PetTester {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Tom";
        tom.breed = "Persian";
        tom.eat();
        tom.makeSound();

        Dog killer = new Dog();
        killer.name = "Killer";
        killer.breed = "Bulldog";
        killer.eat();
        killer.makeSound();

        Pet pet1 = new Cat();
        Pet pet2 = new Dog();
        pet1.makeSound();
        pet2.makeSound();
        pet2.runAway();
        killer.chase(tom);
    }
}
