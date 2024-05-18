package oops.AbstractionMainAbstractClassesInterfaces;

public class MainAbstractClass {
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Calling methods on Car instance
        car.start();
        car.stop();
        ((Car) car).accelerate(); // Typecasting to call Car-specific method

        // Calling methods on Motorcycle instance
        motorcycle.start();
        motorcycle.stop();
        ((Motorcycle) motorcycle).rev(); // Typecasting to call Motorcycle-specific method
    }
}
