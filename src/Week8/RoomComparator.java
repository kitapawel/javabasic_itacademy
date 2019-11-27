package Week8;

import java.util.Comparator;

public class RoomComparator implements Comparator<Room> {
    @Override
    public int compare(Room first, Room second) {
        return first.getArea() - second.getArea();
    }
}
