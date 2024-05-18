package oops.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Creating a Circle object
        Shape circle = new Circle(5.0);
        circle.displayArea();  // Calls Circle's calculateArea method

        // Creating a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayArea();  // Calls Rectangle's calculateArea method
    }
}
