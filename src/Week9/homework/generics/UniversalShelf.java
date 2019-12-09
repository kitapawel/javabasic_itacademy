package Week9.homework.generics;

import java.util.ArrayList;
import java.util.List;

public class UniversalShelf {

    private String name;

    public UniversalShelf(String name){
        this.name = name;
    }

    private List<Box<?>> boxes = new ArrayList<>();

    public void addBoxToShelf(Box item){
        boxes.add(item);
    }

    @Override
    public String toString() {
        return name + " contains " + boxes;
    }
}
