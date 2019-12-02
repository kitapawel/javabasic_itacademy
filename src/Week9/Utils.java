package Week9;

public class Utils {

    public static <T> boolean compareBoxes(Box<T> firstBox, Box<T> secondBox) {
        return firstBox.getItem().equals(secondBox.getItem());
    }

    public static <T extends Number> boolean compareBoxesWithNumbers(Box<T> firstBox, Box<T> secondBox) {
        long firstValue = firstBox.getItem().longValue();
        long secondValue = firstBox.getItem().longValue();

        return firstValue == secondValue;
    }

    public static boolean compareBoxesWithWildCardNumbers(Box<? extends Number> firstBox, Box<? extends Number> secondBox) {
        long firstValue = firstBox.getItem().longValue();
        long secondValue = firstBox.getItem().longValue();

        return firstValue == secondValue;
    }

    public static void putItemIntoBox(Box<? super Number> box, Number item) {
        box.setItem(item);
    }

    public static void printBoxElement(Box<? extends Number> box) {
        Number number = box.getItem();
        System.out.println(number);
    }
}