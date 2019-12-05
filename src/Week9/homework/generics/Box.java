package Week9.homework.generics;

import java.util.ArrayList;

public class Box<T> {

    private String name;

    public Box(String name){
        this.name = name;
    }

    ArrayList<T> items = new ArrayList<>();

    public void addItemToBox(T item){
        items.add(item);
    }

    @Override
    public String toString() {
        return name + " contains " + items;
    }
}
