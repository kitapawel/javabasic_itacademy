package Week6.objectmethods;

public class PersonTester {
    public static void main(String[] args) {
        Person first = new Person("Jan","Kowalski");
        Person second = new Person("Jan","Kowalski");

        if (first == second){
            System.out.println("Persons are the same by object reference");
        }

        if (first.equals(second)){
            System.out.println("Persons are the same by 'equals' method");
        }
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        System.out.println(first);
        System.out.println(second);

    }
}
