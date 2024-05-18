package oops.ClassObjectInheritances;

// Derived class Dog that inherits from Animal
public class Dog extends Animal {
    // Overriding the age variable
    int age = 4;

    // Constructor of Dog class
    public Dog() {
        // Calling the constructor of the superclass (Animal)
        super();
        System.out.println("Dog constructor called");
    }

    // Overriding the sleep method
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    // Method to simulate the Dog speaking
    public void speak() {
        // Using super to access the superclass's age variable
        System.out.println("Age from Animal class: " + super.age);
        // Using this to access the Dog class's age variable
        System.out.println("Age from Dog class: " + this.age);
    }

    // Overloaded speak method with one String argument
    public void speak(String sound) {
        System.out.println("Dog says: " + sound);
    }
}
