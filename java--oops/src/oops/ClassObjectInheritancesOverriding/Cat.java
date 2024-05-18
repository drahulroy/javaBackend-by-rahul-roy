package oops.ClassObjectInheritancesOverriding;

// Derived class Cat that inherits from Animal
public class Cat extends Animal {
    // Overriding the age variable
    int age = 3;

    // Constructor of Cat class
    public Cat() {
        // Calling the constructor of the superclass (Animal)
        super();
        System.out.println("Cat constructor called");
    }

    // Overriding the sleep method
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    // Overriding the speak method
    @Override
    public void speak() {
        // Using super to access the superclass's age variable
        System.out.println("Age from Animal class: " + super.age);
        // Using this to access the Cat class's age variable
        System.out.println("Age from Cat class: " + this.age);
        System.out.println("Cat meows");
    }
}
