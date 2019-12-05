package Week9.homework.generics;

import java.util.ArrayList;

public class UniversalShelf {

    private String name;

    public UniversalShelf(String name){
        this.name = name;
    }

    ArrayList items = new ArrayList<>();

    public void addBoxToShelf(Box item){
        items.add(item);
    }

    @Override
    public String toString() {
        return name + " contains " + items;
    }

}
