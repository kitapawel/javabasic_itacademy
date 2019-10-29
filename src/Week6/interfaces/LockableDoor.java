package Week6.interfaces;

public class LockableDoor extends Door implements Lockable {
    private boolean isLocked;

    public LockableDoor(String colour, String material, Size size) {
        super(colour, material, size);
    }

    @Override
    public void lock(){
        isLocked = true;
        System.out.println("Lockable door has been locked");
    }

    @Override
    public void unlock() {
        isLocked = false;
        System.out.println("Lockable door has been unlocked");
    }

}
