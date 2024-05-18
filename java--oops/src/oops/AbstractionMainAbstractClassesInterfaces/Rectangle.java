package oops.AbstractionMainAbstractClassesInterfaces;

// Rectangle class implementing Shape interface
public class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Providing implementation for the abstract method calculateArea
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overriding default method
    @Override
    public void display() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
    }
}
