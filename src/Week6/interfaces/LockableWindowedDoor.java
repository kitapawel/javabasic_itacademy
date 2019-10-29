package Week6.interfaces;

public class LockableWindowedDoor extends Door implements Lockable, Windowed{
    public LockableWindowedDoor(String colour, String material, Size size) {
        super(colour, material, size);
    }

    @Override
    public void lock() {
        System.out.println("Lockable windowed door has been locked");
    }

    @Override
    public void unlock() {
        System.out.println("Lockable windowed door has been unlocked");
    }

    @Override
    public void OpenWindow() {

    }

    @Override
    public void CloseWindow() {

    }
}
