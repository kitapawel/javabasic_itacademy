package Week9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTester {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            numbers.add(i);
        }


        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            numbers.get(i);
        }

        System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " seconds");

        startTime = System.currentTimeMillis();

        for (Integer number : numbers) {
            int n = number;
        }

        Iterator<Integer> numbersIterator = numbers.iterator();
        while(numbersIterator.hasNext()) {
            int n = numbersIterator.next();
        }

        System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " seconds");
    }
}