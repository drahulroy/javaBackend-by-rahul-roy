package oops.Abstraction;

// Abstract class Shape
public abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Concrete method to display area
    public void displayArea() {
        System.out.println("The area is: " + calculateArea());
    }
}
