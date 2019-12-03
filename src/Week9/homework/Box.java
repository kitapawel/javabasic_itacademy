package Week9.homework;

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

    public T getItemsFromBox(){
        for (T item : items) {
            return item;
        }
        return null;
    }

    @Override
    public String toString() {
        return name + " contains " + items.toString();
    }
}
