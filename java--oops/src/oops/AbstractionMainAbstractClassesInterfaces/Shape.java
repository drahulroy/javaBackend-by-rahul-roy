package oops.AbstractionMainAbstractClassesInterfaces;

// Interface Shape
public interface Shape {
    // Abstract method (does not have a body)
    double calculateArea();

    // Default method
    default void display() {
        System.out.println("Displaying shape information");
    }
}
