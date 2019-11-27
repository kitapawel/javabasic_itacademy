package Week8;

public final class Room {
    private int area;

    public Room(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                '}';
    }

    public int getArea() {
        return area;
    }
}
