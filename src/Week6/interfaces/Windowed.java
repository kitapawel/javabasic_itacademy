package Week6.interfaces;

public interface Windowed {

    void OpenWindow();
    void CloseWindow();

    default void cleanWindow(){ // method has default implementation, can be added later and does not need to be implemented in implementing classes
        System.out.println("Window cleaned");
    }

}
