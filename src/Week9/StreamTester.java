package Week9;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = 0;
        for (Integer number : numbers) {
            if (number > 5) {
                number = number * 2;
                if (max < number) {
                    max = number;
                }
            }
        }
        System.out.println(max);

        int anotherMaxWay = numbers.stream()
                .filter(number -> number > 5)
                .map(number -> number * 2)
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(anotherMaxWay);

        List<Person> people = List.of(
                new Person("Jan", "Kowalski", LocalDate.of(1990, 1, 1)),
                new Person("Ola", "Nowak", LocalDate.of(1995, 1, 1)),
                new Person("Grzegorz", "Brzerzeczikiewicz", LocalDate.of(1985, 1, 1))
        );

        people.stream()
                .filter(person -> person.getBirthDay().isBefore(LocalDate.of(1992, 1, 1)))
                .map(Person::getFirstName)
                .forEach(firstName -> System.out.println(firstName));

        Stream<String> nameStream = people.stream()
                .filter(person -> person.getBirthDay().isBefore(LocalDate.of(1992, 1, 1)))
                .map(Person::getFirstName);

        // nameStream.forEach(System.out::println);
        long count = nameStream.count();
        System.out.println(count);

        System.out.println("================================================");
        people.stream()
                .peek(person -> System.out.println(person))
                .filter(person -> person.getBirthDay().isBefore(LocalDate.of(1992, 1, 1)))
                .peek(System.out::println)
                .map(Person::getFirstName)
                .forEach(System.out::println);

        List<List<Integer>> listsOfIntegers = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8),
                List.of(9, 10)
        );

        System.out.println("================================");
        System.out.println(listsOfIntegers.stream()
                .peek(System.out::println)
                .count());

        System.out.println(listsOfIntegers.stream()
                .flatMap(list -> list.stream())
                .peek(System.out::print)
                .findAny());

    }
}
