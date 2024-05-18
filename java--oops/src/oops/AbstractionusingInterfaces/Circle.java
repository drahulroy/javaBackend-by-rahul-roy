package oops.AbstractionusingInterfaces;

// Circle class implementing Shape interface
public class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
