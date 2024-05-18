package oops.Abstraction;

// Circle class extending Shape
public class Circle extends Shape {
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
