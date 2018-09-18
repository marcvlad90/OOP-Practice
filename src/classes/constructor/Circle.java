package classes.constructor;

public class Circle {

    // The public constants
    public static final int DEFAULT_RADIUS = 3;
    public static final String DEFAULT_COLOR = "red";
    // The private instance variables
    private String color;
    private double radius;

    // The (overloaded) constructors
    public Circle() { // 1st (default) Constructor
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    public Circle(double radius) { // 2nd Constructor
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public Circle(double radius, String color) { // 3rd Constructor
        this.radius = radius;
        this.color = color;
    }

    // The public getters and setters for the private variables
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // The toString() returns a String description of this instance
    @Override
    public String toString() {
        return ("Circle with radius " + this.radius + " and color " + this.color);
    }

    // Return the area of this Circle
    public double getArea() {
        return this.radius * Math.PI;
    }

    // Return the circumference of this Circle
    public double getCurcumference() {
        return this.radius * 2.0 * Math.PI;
    }
}
