package oops.AbstractionMainAbstractClassesInterfaces;

// Motorcycle class extending Vehicle
public class Motorcycle extends Vehicle {
    // Providing implementation for the abstract method start
    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    // Motorcycle-specific method
    public void rev() {
        System.out.println("Motorcycle is revving");
    }
}
