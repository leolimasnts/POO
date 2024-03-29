package ativ03;

public class Sphere {
    static final double PI = 3.14159;
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return ((4.0 / 3.0) * (PI) * (Math.pow(radius, 3)));
    }
}
