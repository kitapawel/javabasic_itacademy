package Week8;

public enum Planet {
    EARTH(6371),
    VENUS(6050),
    MARS(5999);

    private double radius;

    Planet(double radius) { //cannot create new instance outside of enum; constructor is private by default
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getEquator(){
        return radius *Math.PI;
    }
}
