package Week6.interfaces;

public interface ReplacableWindow extends Windowed {
    void replaceWindow();

    @Override
    default void cleanWindow() {

    }
}
