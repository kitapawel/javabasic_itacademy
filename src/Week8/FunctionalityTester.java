package Week8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;

public class FunctionalityTester {
    public static void main(String[] args) {
        Person kowalski = new Person("Jan", "Kowalski", LocalDate.of(1990, 1, 1));

        PersonTester ageMoreThan18Tester = new PersonTester() {
            @Override
            public boolean testPerson(Person person) {
                return LocalDate.now()
                        .minus(18, ChronoUnit.YEARS)
                        .isAfter(person.getBirthDay());
            }
        };

//        PersonTester ageLessThan65years = new PersonTester() {
//            @Override
//            public boolean testPerson(Person person) {
//                return LocalDate.now()
//                        .minus(65, ChronoUnit.YEARS)
//                        .isBefore(person.getBirthDay());
//            }
//        };

        System.out.println(checkPerson(kowalski, new PersonTester() {
            @Override
            public boolean testPerson(Person person) {
                return LocalDate.now()
                        .minus(18, ChronoUnit.YEARS)
                        .isAfter(person.getBirthDay());
            }
        }));

//        System.out.println(checkPerson(kowalski, ageLessThan65years));

        System.out.println(checkPerson(kowalski, new PersonTester() {
            @Override
            public boolean testPerson(Person person) {
                return LocalDate.now()
                        .minus(65, ChronoUnit.YEARS)
                        .isBefore(person.getBirthDay());
            }
        }));

        System.out.println(checkPerson(kowalski, new PersonTester() {
            @Override
            public boolean testPerson(Person person) {
                return "Kowalski".equals(person.getLastName());
            }
        }));

        System.out.println(checkPerson(kowalski, (Person person) -> {
            return "Kowalski".equals(person.getLastName());
        }));

        System.out.println(checkPerson(kowalski, (Person person) -> "Kowalski".equals(person.getLastName())));

        System.out.println(checkPerson(kowalski, (person) -> "Kowalski".equals(person.getLastName())));

        System.out.println(checkPerson(kowalski, person -> "Kowalski".equals(person.getLastName())));
        System.out.println(checkPerson(kowalski, person -> "Nowak".equals(person.getLastName())));
        System.out.println(checkPerson(kowalski, person -> LocalDate.now().minus(65, ChronoUnit.YEARS).isBefore(person.getBirthDay())));
        System.out.println(checkPerson(kowalski, person -> LocalDate.now().minus(18, ChronoUnit.YEARS).isAfter(person.getBirthDay())));



        System.out.println(checkPersonWithPredicate(kowalski, person -> LocalDate.now().minus(18, ChronoUnit.YEARS).isAfter(person.getBirthDay())));


    }

    private static boolean checkPerson(Person person, PersonTester personTester) {
        return personTester.testPerson(person);
    }

    private static boolean checkPersonWithPredicate(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }
}