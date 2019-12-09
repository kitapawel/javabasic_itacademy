package Week9.homework.generics;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T> {

    private String name;

    public Shelf(String name){
        this.name = name;
    }

    private List <Box<T>> boxes = new ArrayList<>() {
    };

    public void addBoxToShelf(Box<T> box){
        boxes.add(box);
    }

    @Override
    public String toString() {
        return name + " contains " + boxes;
    }

}
