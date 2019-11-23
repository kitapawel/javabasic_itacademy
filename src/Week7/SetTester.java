package Week7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        System.out.println(strings);

        Set<String> linkedStrings = new LinkedHashSet<>();

        linkedStrings.add("first");
        linkedStrings.add("second");
        linkedStrings.add("third");
        linkedStrings.add("fourth");

        System.out.println(linkedStrings);

        Set<Person> people = new HashSet<>();
        Person nowak = new Person("Jan", "Nowak");
        Person kowalski = new Person ("Janusz", "Kowalski");
        people.add(nowak);
        System.out.println(people);
        people.add(kowalski);
        System.out.println(people);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("first");
        treeSet.add("second");
        treeSet.add("third");
        treeSet.add("fourth");
        System.out.println(treeSet);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(11);
        numbers.add(21);
        System.out.println(numbers);

        System.out.println("Ceiling for 5 "+ numbers.ceiling(5));
        System.out.println("Floor for 5 "+ numbers.floor(5));
        System.out.println("Head subset for 5: " + numbers.headSet(5));
        System.out.println("Tail subset for 5: " + numbers.tailSet(5));
    }
}
