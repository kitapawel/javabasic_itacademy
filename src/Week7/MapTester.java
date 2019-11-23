package Week7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class MapTester {

    public static void main(String[] args) {
       // Map<Person,String> beerLovers = new HashMap<>();
        Map<Person,String> beerLovers = new TreeMap<>();

        Person kowalski = new Person ("Jan", "Kowalski");
        Person kita = new Person ("Pawel", "Kita");
        Person nowak = new Person("Piotr", "Nowak");

        beerLovers.put(kowalski, "Jasne");
        beerLovers.put(kita, "IPA");
        beerLovers.put(nowak, "Ciemne");

        System.out.println(kowalski + " lubi piwo " + beerLovers.get(kowalski));
        System.out.println(kita + " lubi piwo " + beerLovers.get(kita));
        System.out.println(nowak + " lubi piwo " + beerLovers.get(nowak));

        beerLovers.put(kita, "Ciemne");
        System.out.println(kita + " lubi piwo " + beerLovers.get(kita));
        System.out.println(beerLovers);
    }
}
