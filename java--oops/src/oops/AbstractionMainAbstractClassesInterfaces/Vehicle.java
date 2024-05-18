package oops.AbstractionMainAbstractClassesInterfaces;

// Abstract class Vehicle
public abstract class Vehicle {
    // Abstract method (does not have a body)
    public abstract void start();

    // Concrete method
    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}
