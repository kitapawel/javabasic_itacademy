package Week9;

@FunctionalInterface
public interface OurComparator {
    boolean compare(String a, String b);

    static void printMessage(String message) {
        System.out.println(message);
    }

    default void printAnotherMessage(String message) {
        System.out.println(message);
    }
}