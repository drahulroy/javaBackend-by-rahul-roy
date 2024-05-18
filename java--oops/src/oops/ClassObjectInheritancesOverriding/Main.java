package oops.ClassObjectInheritancesOverriding;


public class Main {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog d1 = new Dog();

        // Calling the eating method inherited from Animal class
        d1.eating();

        // Calling the speak method of Dog class
        d1.speak();

        // Calling the overloaded speak method with a parameter
        d1.speak("Bark");

        // Accessing inherited and overridden properties
        System.out.println("Dog's color: " + d1.colour);
        System.out.println("Dog's age from Animal class: " + ((Animal) d1).age); // Explicit cast to access Animal's age

        // Demonstrating method overriding
        d1.sleep();

        // Creating an instance of Cat
        Cat c1 = new Cat();
        c1.eating();
        c1.speak();
        c1.sleep();

        // Creating an instance of Bird
        Bird b1 = new Bird();
        b1.eating();
        b1.speak();
        b1.fly();
    }
}
