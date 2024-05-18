package oops.ClassObjectInheritancesOverriding;

// Derived class Bird that inherits from Animal
public class Bird extends Animal {
    // Overriding the age variable
    int age = 2;

    // Constructor of Bird class
    public Bird() {
        // Calling the constructor of the superclass (Animal)
        super();
        System.out.println("Bird constructor called");
    }

    // Overriding the sleep method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    // Overriding the speak method
    @Override
    public void speak() {
        // Using super to access the superclass's age variable
        System.out.println("Age from Animal class: " + super.age);
        // Using this to access the Bird class's age variable
        System.out.println("Age from Bird class: " + this.age);
        System.out.println("Bird chirps");
    }

    // Method to simulate flying
    public void fly() {
        System.out.println("Bird is flying");
    }
}
