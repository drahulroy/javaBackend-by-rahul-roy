package oops.AbstractionMainAbstractClassesInterfaces;

public class MainInterface {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Calling methods on Circle instance
        circle.display();
        System.out.println("Circle area: " + circle.calculateArea());

        // Calling methods on Rectangle instance
        rectangle.display();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
