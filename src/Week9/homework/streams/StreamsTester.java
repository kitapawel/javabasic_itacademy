package Week9.homework.streams;

import Week6.objectmethods.PersonTester;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamsTester {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", LocalDate.of(1950, 12,2), Sex.MALE, 3000, new Address("Zarzecze"));
        Person person2 = new Person("Janina", "Kowalski", LocalDate.of(1962, 11,5), Sex.FEMALE, 2000, new Address("Zarzecze"));
        Person person3 = new Person("Maria", "Wojtan", LocalDate.of(1945, 6,11), Sex.FEMALE, 4000, new Address("Kraków"));
        Person person4 = new Person("Tadeusz", "Nowak", LocalDate.of(1970, 1,16), Sex.MALE, 6000, new Address("Biłgoraj"));
        Person person5 = new Person("Janusz", "Szatan", LocalDate.of(1980, 7,7), Sex.MALE, 8000, new Address("Zofianka"));
        Person person6 = new Person("Martyna", "Diaboł", LocalDate.of(2001, 4,22), Sex.FEMALE, 1000, new Address("Kraków"));
        Person person7 = new Person("Tomasz", "Matt", LocalDate.of(2005, 3,2), Sex.MALE, 2000, new Address("Kraków"));
        Person person8 = new Person("Jerzy", "Duda", LocalDate.of(1995, 2,28), Sex.MALE, 1000, new Address("Kraków"));
        Person person9 = new Person("Henryk", "Darski", LocalDate.of(1925, 5,1), Sex.MALE, 2000, new Address("Kraków"));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        System.out.println(person1.getAge());

        System.out.println("===3.a. solutions===");

        List<Person> womenAbove65 =
                persons.stream()
                .filter(person -> person.getAge() > 65 && person.getSex() == Sex.FEMALE)
                .collect(Collectors.toList());
        System.out.println("Women above 65: " + womenAbove65);

        List<Person> menAbove65 =
                persons.stream()
                        .filter(person -> person.getAge() > 65 && person.getSex() == Sex.MALE)
                        .collect(Collectors.toList());
        System.out.println("Man above 65: " + menAbove65);

        List<Person> salaryWomenBelow5000 =
                persons.stream()
                        .filter(person -> person.getSalary() < 5000 && person.getSex() == Sex.FEMALE)
                        .collect(Collectors.toList());
        System.out.println("Women with salary below 5000: " + salaryWomenBelow5000);

        List<Person> youngerThan65FromKrakow =
                persons.stream()
                        .filter(person -> person.getAge() < 18 && person.getAddress().toString() == "Kraków")
                        .collect(Collectors.toList());
        System.out.println("People younger than 65 from Kraków: " + youngerThan65FromKrakow);

        List<Person> notFromKrakow =
                persons.stream()
                        .filter(person -> person.getAddress().toString() != "Kraków")
                        .collect(Collectors.toList());
        System.out.println("People not from Kraków: " + notFromKrakow);

        System.out.println();
        System.out.println("===3.b. solutions===");

        OptionalDouble avgSalary =
                persons.stream()
                        .mapToDouble(Person::getSalary)
                        .average();
        System.out.println("Average salary of all persons is: " + avgSalary.getAsDouble());

        List<Person> numberOfWomenInKrakow =
                persons.stream()
                    .filter(person -> person.getSex() == Sex.FEMALE && person.getAddress().toString() == "Kraków")
                    .collect(Collectors.toList());
        System.out.println("Women in Kraków: " + numberOfWomenInKrakow + ". Number of women in Kraków: " + numberOfWomenInKrakow.size() + ".");

        List<Person> numberOfMenInKrakow =
                persons.stream()
                        .filter(person -> person.getSex() == Sex.MALE && person.getAddress().toString() == "Kraków")
                        .collect(Collectors.toList());
        System.out.println("Men in Kraków: " + numberOfMenInKrakow + ". Number of men in Kraków: " + numberOfMenInKrakow.size() + ".");


        List<Person> numberOfMenAbove65 =
                persons.stream()
                        .filter(person -> person.getSex() == Sex.MALE && person.getAge() > 30)
                        .collect(Collectors.toList());
        System.out.println("Men above 30: " + numberOfMenAbove65 + ". Number of men older than 30: " + numberOfMenAbove65.size() + ".");

        Person oldestPerson =
                persons.stream()
                        .max(Comparator.comparing(Person::getAge))
                        .orElseThrow(NoSuchElementException::new);
        System.out.println("The oldest person is: " + oldestPerson);

        Person youngestPerson =
                persons.stream()
                        .min(Comparator.comparing(Person::getAge))
                        .orElseThrow(NoSuchElementException::new);
        System.out.println("The youngest person is: " + youngestPerson);

        int totalSalary =
                persons.stream()
                        .map(person -> person.getSalary())
                        .reduce(0, (a, b) -> a + b);
        System.out.println("Total salary of all people is: " + totalSalary);


        System.out.println();
        System.out.println("===3.c solutions===");

        char charToTest = 'H';
        boolean doesAnyPersonStartWithA =
                persons.stream()
                    .map(person -> person.getFirstName())
                    .anyMatch(s -> s.charAt(0) == charToTest);
        System.out.println("Does any person's first name start with " + charToTest + ": " + doesAnyPersonStartWithA);

        String char2ToTest = "d";
        boolean doesAnyPersonLastNameContainA =
                persons.stream()
                        .map(person -> person.getLastName())
                        .allMatch(a -> a.contains(char2ToTest));
        System.out.println("Does all person's last name contain letter " + char2ToTest + ": " + doesAnyPersonLastNameContainA);

        System.out.println();
        System.out.println("===4.0 solutions===");

        System.out.println("List of people before generating usernames: " + persons);
        for(Person person : persons){
            person.setUserName(userName(person));
        }
        System.out.println("List of people after generating usernames: "+ persons);

        System.out.println();
        System.out.println("===5.0 solutions===");

        List<String> userNamesFromKrakow =
                persons.stream()
                        .filter(person -> person.getAddress().toString() == "Kraków")
                        .map(person -> person.getUserName())
                        .collect(Collectors.toList());
        System.out.println("Usernames of people from Kraków: " + userNamesFromKrakow);

    }

    public static String userName(Person p){
        String firstName = p.getFirstName() + p.getLastName() + p.getBirthday().toString();
        return  firstName;

    }

}
