package Week9;

public class OurComparatorTester {
    public static void main(String[] args) {
        String a = "test";
        String b = "TEST";

        OurComparator ourComparator = new OurComparator() {
            @Override
            public boolean compare(String a, String b) {
                return a.equalsIgnoreCase(b);
            }
        };

        System.out.println(compare(a, b, (first, second) -> first.equals(second)));
        System.out.println(compare(a, b, String::equals));

        System.out.println(compare(a, b, String::equalsIgnoreCase));

        OurComparator.printMessage("Hello comparator!");


        Person kowalski = createPerson(() -> new Person("Jan", "Kowalski"));
        System.out.println(kowalski);
        //Person emptyPerson = createPerson(() -> new Person());
        Person emptyPerson = createPerson(Person::new);
        System.out.println(emptyPerson);
        emptyPerson.setFirstName("Ola");
        emptyPerson.setLastName("Nowak");
        System.out.println(emptyPerson);
    }

    private static boolean compare(String a, String b, OurComparator comparator) {
        comparator.printAnotherMessage("Hello from default method!");
        return comparator.compare(a, b);
    }

    private static Person createPerson(PersonSupplier supplier) {
        return supplier.get();
    }
}
