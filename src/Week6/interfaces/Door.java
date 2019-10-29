package Week6.interfaces;
class Door {
    public Door(String colour, String material, Size size) {
        this.colour = colour;
        this.material = material;
        this.size = size;
    }

    private String colour;
    private String material;
    private Size size;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    private boolean isOpen;

    public void open(){
        isOpen = true;
        System.out.println("Door has been opened");
    }
    public void close(){
        isOpen = false;
        System.out.println("Door has been closed");
    }
}
