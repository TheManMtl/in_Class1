/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Circle {

    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    public double getDiameter() {
        return getRadius() * 2;
    }

    public double getCircumference() {
        return PI * getRadius() * 2;
    }


}
