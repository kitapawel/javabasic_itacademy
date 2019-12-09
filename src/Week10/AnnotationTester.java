package Week10;

public class AnnotationTester {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sleep(3);
        cat.sleep2hours();

        printItems(new String ("aaaaa"), new Integer(12), new String("bbb"));
    }

    public static void printItems(Object... items){
        for (Object item : items){
            System.out.println(item);
        }
    }

}
