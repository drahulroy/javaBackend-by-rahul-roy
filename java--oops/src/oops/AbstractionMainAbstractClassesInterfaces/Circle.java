package oops.AbstractionMainAbstractClassesInterfaces;

// Circle class implementing Shape interface
public class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Providing implementation for the abstract method calculateArea
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding default method
    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
}
