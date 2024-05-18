package oops.AbstractionusingInterfaces;

public class Main {
    public static void main(String[] args) {
        // Creating a Circle object
        Shape circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());

        // Creating a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
