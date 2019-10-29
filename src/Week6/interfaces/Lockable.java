package Week6.interfaces;

public interface Lockable {

    static final boolean HAS_LOCK = true; // constant value, static and final are by default and don't need to be added in interfaces, we cannot

    public void lock(); //all methods in interfaces are public so the word is redundant
    void unlock();
}
