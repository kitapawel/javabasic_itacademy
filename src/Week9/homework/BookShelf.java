package Week9.homework;

import java.util.ArrayList;

public class BookShelf<Box > {

    private String name;

    public BookShelf(String name){
        this.name = name;
    }

    ArrayList<Box> boxes = new ArrayList<>();

    public void addBoxToShelf(Box item){
        boxes.add(item);
    }

    public Box getBoxesFromShelf(){
        for (Box item : boxes) {
            return item;
        }
        return null;
    }

    @Override
    public String toString() {
        return name + " contains " + boxes.toString();
    }

}
