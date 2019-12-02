package Week9;

import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) {
        Optional<Person> optionalPerson = getPerson();
        if (optionalPerson.isPresent()) {
            System.out.println(optionalPerson.get().getFirstName());
        }

        optionalPerson.ifPresent(person -> System.out.println(person.getFirstName()));
        Person p = optionalPerson.orElse(new Person());
        System.out.println(p);

        String firstName = optionalPerson.map(person -> person.getFirstName()).orElse("No first-name defined");
        System.out.println(firstName);
    }

    private static Optional<Person> getPerson() {
        double random = Math.random();
        System.out.println(random);
        if (random > 0.5) {
            return Optional.of(new Person("Jan", "Kowalski"));
        } else {
            return Optional.empty();
        }
    }
}
