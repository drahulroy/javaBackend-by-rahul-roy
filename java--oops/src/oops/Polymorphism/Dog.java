package oops.Polymorphism;

// Dog class extending Animal
public class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
