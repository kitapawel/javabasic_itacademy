package Week9;

import java.util.ArrayList;
import java.util.List;

public class GenericsTester {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add("Test");
        list.add(new Person());

        List persons = new ArrayList();
        persons.add(new Person());
        persons.add(new Person());

        for (Object o : persons) {
            System.out.println(((Person) o).getFirstName());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);

        for (Integer number : numbers) {

        }

        Box<Integer> integerBox = new Box<>(5);
        integerBox.setItem(10);
        System.out.println(integerBox.getItem());

        Box<Integer> anotherIntegerBox = new Box<>(10);
        System.out.println(Utils.compareBoxes(integerBox, anotherIntegerBox));

        Box<String> stringBox = new Box<>("Test");
        Box<String> stringBox2 = new Box<>("Java");
        System.out.println(Utils.compareBoxes(stringBox, stringBox2));

        Box<Long> longBox = new Box<>(10L);
        Utils.compareBoxesWithNumbers(integerBox, anotherIntegerBox);

        Box<Number> numberBox = new Box<>(20);
        Utils.putItemIntoBox(numberBox, 25);
        System.out.println(numberBox.getItem());

        Box<Object> objectBox = new Box<>(new Object());
        Utils.putItemIntoBox(objectBox, 20);
        System.out.println(objectBox.getItem());

        Utils.printBoxElement(numberBox);

        Box<Integer> intBox1 = new Box<>(1);
        Box<Integer> intBox2 = new Box<>(1);
        Box<Long> longBox1 = new Box<>(1L);
        Utils.compareBoxesWithNumbers(intBox1, intBox2);
        Utils.compareBoxesWithWildCardNumbers(intBox1, intBox2);
        Utils.compareBoxesWithWildCardNumbers(intBox1, longBox1);
    }
}