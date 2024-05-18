package oops.AbstractionMainAbstractClassesInterfaces;

// Car class extending Vehicle
public class Car extends Vehicle {
    // Providing implementation for the abstract method start
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    // Car-specific method
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}
