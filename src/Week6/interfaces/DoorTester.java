package Week6.interfaces;

public class DoorTester {
    public static void main(String[] args) {

        Door stddoor =  new Door("White","Wood", new Size (5,2));
        LockableDoor ld = new LockableDoor("Blue","Plastic", new Size (3,2));
        LockableWindowedDoor lwd = new LockableWindowedDoor("Black","Metal", new Size (1,1));

        Door[] doors = new Door[3];
        doors[0] = stddoor;
        doors[1] = ld;
        doors[2] = lwd;

        for (int i = 0; i < doors.length; i++){
            Door door = doors[i];
            door.open();
            door.close();
        }

        Lockable[] lockables = new Lockable[2];
        lockables[0] = ld;
        lockables [1] = lwd;
        //lockables[2] = stddoor; Array based on interface - cannot accept values that do not implement the interface

        for (Lockable door : lockables){
            door.lock();
            door.unlock();
        }
    }
}
